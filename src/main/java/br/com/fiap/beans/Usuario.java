package br.com.fiap.beans;

public class Usuario {
    private String nome, phone, email, senha;

    public Usuario()
    {
        super();
    }

    public Usuario(String nome, String phone, String email, String senha) {
        this.nome = nome;
        this.phone = phone;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String cpf) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "\n nome='" + nome + '\'' +
                ",\n phone=" + phone +
                ",\n email=" + email +
                ",\n senha='" + senha + '\'' +
                "}\n";
    }
}
