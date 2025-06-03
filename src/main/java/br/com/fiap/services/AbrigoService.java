package br.com.fiap.services;

import br.com.fiap.dto.ShelterLocation;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@ApplicationScoped
public class AbrigoService {

    public static double calcularDistancia(double lat1, double lon1, double lat2, double lon2) {
        final int R = 6371; // Raio da Terra em km
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return R * c; // Distância em km
    }


    public List<ShelterLocation> gerarAbrigosProximos(double latitudeRef, double longitudeRef) {
        List<ShelterLocation> locais = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i <= 10; i++) {
            double latitude = latitudeRef + (random.nextDouble() - 0.5) * 0.1;
            double longitude = longitudeRef + (random.nextDouble() - 0.5) * 0.1;

            String titulo = "Abrigo " + String.format("%03d", i);
            String descricao = "Abrigo próximo com capacidade para " + (50 + random.nextInt(150)) + " pessoas.";

            locais.add(new ShelterLocation(latitude, longitude, titulo, descricao));
        }

        // Ordenar pela distância
        locais.sort((a, b) -> {
            double distA = calcularDistancia(latitudeRef, longitudeRef, a.getLatitude(), a.getLongitude());
            double distB = calcularDistancia(latitudeRef, longitudeRef, b.getLatitude(), b.getLongitude());
            return Double.compare(distA, distB);
        });

        // Retornar só os 3 primeiros
        return locais.stream().limit(3).toList();
    }

}
