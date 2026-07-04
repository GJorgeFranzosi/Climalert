package ar.edu.utn.ba.ddsi.sistema_climatico.adapter;

import ar.edu.utn.ba.ddsi.sistema_climatico.domain.Clima;
import ar.edu.utn.ba.ddsi.sistema_climatico.dto.WeatherResponse;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
public class WeatherApiAdapter implements ClimaAdapter {

  @Override
  public Clima adaptar(WeatherResponse weatherResponse) {
    return new Clima(
        weatherResponse.getTemperatura(),
        weatherResponse.getHumedad(),
        weatherResponse.getDescripcion(),
        LocalDateTime.now() //Registramos fecha
    );
  }
}