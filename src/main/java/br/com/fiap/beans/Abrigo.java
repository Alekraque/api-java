package br.com.fiap.beans;

public class Abrigo {
    private String nomeAbrigo;
    private int quantidadeAbrigos;
    private int disponibilidadeAbrigos;
    private boolean abrigoDisponivel;

    public Abrigo()
    {
        super();
    }

    public Abrigo(String nomeAbrigo, int quantidadeAbrigos, int disponibilidadeAbrigos, boolean abrigoDisponivel) {
        this.nomeAbrigo = nomeAbrigo;
        this.quantidadeAbrigos = quantidadeAbrigos;
        this.disponibilidadeAbrigos = disponibilidadeAbrigos;
        this.abrigoDisponivel = abrigoDisponivel;
    }

    public String getNomeLinha() {
        return nomeAbrigo;
    }

    public void setNomeAbrigo(String nomeAbrigo) {
        this.nomeAbrigo = nomeAbrigo;
    }

    public int getQuantidadeAbrigos() {
        return quantidadeAbrigos;
    }

    public void setQuantidadeEstacoes(int quantidadeAbrigos) {
        this.quantidadeAbrigos = quantidadeAbrigos;
    }

    public int getDisponibilidadeAbrigos() {
        return disponibilidadeAbrigos;
    }

    public void setDisponibilidadeAbrigos(int disponibilidadeAbrigos) {
        this.disponibilidadeAbrigos = disponibilidadeAbrigos;
    }

    public boolean isAbrigoDisponivel() {
        return abrigoDisponivel;
    }

    public void setAbrigoDisponivel(boolean abrigoDisponivel) {
        this.abrigoDisponivel = abrigoDisponivel;
    }

    @Override
    public String toString() {
        return "Linha{" +
                "\n nomeLinha='" + nomeAbrigo + '\'' +
                ",\n quantidadeEstacoes=" + quantidadeAbrigos +
                ",\n quantidadeBaldiacoes=" + disponibilidadeAbrigos +
                ",\n linhaEmOperacao=" + abrigoDisponivel +
                '}';
    }
}
