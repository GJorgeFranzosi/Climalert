package ar.edu.utn.ba.ddsi.sistema_climatico.adapter;

import ar.edu.utn.ba.ddsi.sistema_climatico.domain.Clima;
import ar.edu.utn.ba.ddsi.sistema_climatico.dto.RespuestaClima;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
public class WeatherApiAdapter implements ClimaAdapter {

  @Override
  public Clima adaptar(RespuestaClima response) {

    Clima clima = new Clima(
        response.getClimaActual().getTemperatura(),
        response.getClimaActual().getHumedad(),
        response.getClimaActual().getCondicionClimatica().getText(),
        LocalDateTime.now()
    );
    return clima;
  }
}