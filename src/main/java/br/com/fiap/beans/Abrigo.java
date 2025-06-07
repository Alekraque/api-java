package br.com.fiap.beans;

public class Abrigo {
    private String titulo;
    private String descricao;
    private String endereco;

    public Abrigo() {}
    public Abrigo(String titulo, String descricao, String endereco) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.endereco = endereco;
    }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
}
