package ar.edu.utn.ba.ddsi.sistema_climatico.client;

import ar.edu.utn.ba.ddsi.sistema_climatico.dto.RespuestaClima;

public interface WeatherApiClient {
  RespuestaClima obtenerClimaActual();
}