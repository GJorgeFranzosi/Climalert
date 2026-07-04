package ar.edu.utn.ba.ddsi.sistema_climatico.adapter;

import ar.edu.utn.ba.ddsi.sistema_climatico.domain.Clima;
import ar.edu.utn.ba.ddsi.sistema_climatico.dto.WeatherResponse;

public interface ClimaAdapter {
  Clima adaptar(WeatherResponse weatherResponse);
}