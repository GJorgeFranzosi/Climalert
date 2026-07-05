package ar.edu.utn.ba.ddsi.sistema_climatico.client;

import ar.edu.utn.ba.ddsi.sistema_climatico.config.WeatherApiProperties;
import ar.edu.utn.ba.ddsi.sistema_climatico.dto.WeatherResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
@RequiredArgsConstructor
public class WeatherApiClientImpl implements WeatherApiClient {

  private final WeatherApiProperties properties;
  private final RestTemplate restTemplate;

  @Override
  public WeatherResponse obtenerClimaActual() {

    String uri = UriComponentsBuilder
        .fromUriString(properties.getUrl())
        .queryParam("key", properties.getKey())
        .queryParam("q", properties.getCity())
        .toUriString();

    try {
      WeatherResponse response = restTemplate.getForObject(uri, WeatherResponse.class);
      /*
      System.out.println("URI: " + uri);
      System.out.println("Response: " + response);
      */
      return response;
    } catch (RestClientException e) {
      throw new RuntimeException("Error al consumir WeatherAPI.", e);
    }
  }
}