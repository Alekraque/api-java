package br.com.fiap.dao;

import br.com.fiap.beans.Usuario;
import br.com.fiap.conexoes.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    public Connection minhaConexao;

    public UsuarioDAO() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new Conexao().conexao();
    }

    public String inserir(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO usuarios (nome, email, senha, phone) VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = minhaConexao.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getPhone());
            stmt.setString(4, usuario.getSenha());

            stmt.executeUpdate();
            return "Usuário criado com sucesso.";
        }
    }

    public List<Usuario> selecionar() throws SQLException {
        List<Usuario> listaUsuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";

        try (PreparedStatement stmt = minhaConexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setPhone(rs.getString("telefone"));
                listaUsuarios.add(usuario);
            }
        }

        return listaUsuarios;
    }
}
