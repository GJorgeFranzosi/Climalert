package ar.edu.utn.ba.ddsi.sistema_climatico.adapter;

import ar.edu.utn.ba.ddsi.sistema_climatico.domain.Clima;
import ar.edu.utn.ba.ddsi.sistema_climatico.dto.RespuestaClima;

public interface ClimaAdapter {
  Clima adaptar(RespuestaClima respuestaClima);
}