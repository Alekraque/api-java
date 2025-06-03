package br.com.fiap.beans;

public class Status {
    private String descricao;
    private boolean emManutencao;
    private int previsaoMin;
    private Abrigo abrigoEmManutencao;

    public Status()
    {
        super();
    }

    public Status(String descricao, boolean emManutencao, int previsaoMin) {
        this.descricao = descricao;
        this.emManutencao = emManutencao;
        this.previsaoMin = previsaoMin;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isEmManutencao() {
        return emManutencao;
    }

    public void setEmManutencao(boolean emManutencao) {
        this.emManutencao = emManutencao;
    }

    public int getPrevisaoMin() {
        return previsaoMin;
    }

    public void setPrevisaoMin(int previsaoMin) {
        this.previsaoMin = previsaoMin;
    }

    public Abrigo getAbrigoEmManutencao() {
        return abrigoEmManutencao;
    }

    public void setAbrigoEmManutencao(Abrigo abrigoEmManutencao) {
        this.abrigoEmManutencao = abrigoEmManutencao;
    }

    @Override
    public String toString() {
        return "Status{" +
                "\n descricao='" + descricao + '\'' +
                ",\n emManutencao=" + emManutencao +
                ",\n previsaoMin=" + previsaoMin +
                ",\n linhaManutencao=" + abrigoEmManutencao +
                '}';
    }
}
