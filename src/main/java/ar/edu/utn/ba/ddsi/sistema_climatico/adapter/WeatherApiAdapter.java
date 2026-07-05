package ar.edu.utn.ba.ddsi.sistema_climatico.adapter;

import ar.edu.utn.ba.ddsi.sistema_climatico.domain.Clima;
import ar.edu.utn.ba.ddsi.sistema_climatico.dto.WeatherResponse;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
public class WeatherApiAdapter implements ClimaAdapter {

  @Override
  public Clima adaptar(WeatherResponse response) {

    //System.out.println("Response recibido: " + response);
    //System.out.println("Current: " + response.getCurrent());
    Clima clima = new Clima(
        response.getCurrent().getTemperatura(),
        response.getCurrent().getHumedad(),
        response.getCurrent().getCondition().getText(),
        LocalDateTime.now()
    );
    //System.out.println("Clima creado: " + clima);
    return clima;
  }

}