package ar.edu.utn.ba.ddsi.sistema_climatico.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Clima {
  private double temperatura;
  private int humedad;
  private String descripcion;
  private LocalDateTime fechaHora;
}