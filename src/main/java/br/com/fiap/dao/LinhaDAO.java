package br.com.fiap.dao;

import br.com.fiap.beans.Abrigo;
import br.com.fiap.conexoes.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LinhaDAO
{
    public Connection minhaConexao;

    public LinhaDAO() throws SQLException, ClassNotFoundException
    {
        super();
        this.minhaConexao = new Conexao().conexao();
    }

    public String inserir(Abrigo linha, int idLinha) throws SQLException
    {
        PreparedStatement stmt = minhaConexao.prepareStatement("INSERT INTO linha VALUES (?, ?, ?, ?, ?)");

        String emOperacao = Boolean.toString(linha.isAbrigoDisponivel());
        if(emOperacao.equals("false"))
        {
            emOperacao = "f";
        }
        else
        {
            emOperacao = "t";
        }

        stmt.setInt(1, idLinha);
        stmt.setString(1, linha.getNomeLinha());
        stmt.setInt(2, linha.getDisponibilidadeAbrigos());
        stmt.setInt(3, linha.getDisponibilidadeAbrigos());
        stmt.setString(3, emOperacao);

        stmt.execute();
        stmt.close();
        return "Linha criada com sucesso";
        }
}
