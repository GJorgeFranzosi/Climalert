package ar.edu.utn.ba.ddsi.sistema_climatico.client;

import ar.edu.utn.ba.ddsi.sistema_climatico.dto.WeatherResponse;

public interface WeatherApiClient {
  WeatherResponse obtenerClimaActual();
}