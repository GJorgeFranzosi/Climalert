package ar.edu.utn.ba.ddsi.sistema_climatico.strategy;

import ar.edu.utn.ba.ddsi.sistema_climatico.domain.Clima;

public interface EstrategiaAlerta {
  boolean esCondicionCritica(Clima clima);
}
