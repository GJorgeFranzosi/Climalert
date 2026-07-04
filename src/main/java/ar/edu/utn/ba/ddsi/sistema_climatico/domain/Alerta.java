package ar.edu.utn.ba.ddsi.sistema_climatico.domain;

import lombok.Getter;
import java.time.LocalDateTime;

@Getter
public class Alerta { //Evento NO mutable
  private final Clima clima;
  private final LocalDateTime fecha;

  public Alerta(Clima clima) {
    this.clima = clima;
    this.fecha = LocalDateTime.now();
  }
}