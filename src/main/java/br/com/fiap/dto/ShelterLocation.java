package br.com.fiap.dto;

public class ShelterLocation {
    public double latitude;
    public double longitude;
    public String titulo;
    public String descricao;

    public ShelterLocation() {
    }

    public ShelterLocation(double latitude, double longitude, String titulo, String descricao) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
