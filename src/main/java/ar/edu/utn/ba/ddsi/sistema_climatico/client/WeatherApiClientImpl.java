package ar.edu.utn.ba.ddsi.sistema_climatico.client;

import ar.edu.utn.ba.ddsi.sistema_climatico.dto.WeatherResponse;
import org.springframework.stereotype.Component;

@Component
public class WeatherApiClientImpl implements WeatherApiClient {

  @Override
  public WeatherResponse obtenerClimaActual() {
    return new WeatherResponse(37.5, 70, "Soleado");
  }
}