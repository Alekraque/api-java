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
}
