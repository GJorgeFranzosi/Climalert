package ar.edu.utn.ba.ddsi.sistema_climatico.strategy;

import ar.edu.utn.ba.ddsi.sistema_climatico.domain.Clima;
import org.springframework.stereotype.Component;

@Component
public class EstrategiaTemperaturaHumedad implements EstrategiaAlerta {
  private static final double TemperaturaMaxima = 35;
  private static final int HumedadMaxima = 60;

  @Override
  public boolean esCondicionCritica(Clima clima) {
    return clima.getTemperatura() > TemperaturaMaxima && clima.getHumedad() > HumedadMaxima;
  }
}