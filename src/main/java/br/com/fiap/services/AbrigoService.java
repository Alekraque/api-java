import br.com.fiap.dto.ShelterLocation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public List<ShelterLocation> gerarAbrigosNoBrasil() {
    Random random = new Random();
    List<ShelterLocation> locais = new ArrayList<>();

    double minLat = -33.7;
    double maxLat = 5.3;
    double minLon = -73.9;
    double maxLon = -34.8;

    for (int i = 1; i <= 100; i++) {
        double latitude = minLat + (maxLat - minLat) * random.nextDouble();
        double longitude = minLon + (maxLon - minLon) * random.nextDouble();

        String titulo = "Abrigo " + String.format("%03d", i);
        String descricao = "Abrigo temporário com capacidade para " + (50 + random.nextInt(150)) + " pessoas.";

        locais.add(new ShelterLocation(latitude, longitude, titulo, descricao));
    }

    return locais;
}
