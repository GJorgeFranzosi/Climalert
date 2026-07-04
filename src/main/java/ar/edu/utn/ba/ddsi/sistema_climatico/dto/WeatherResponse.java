package ar.edu.utn.ba.ddsi.sistema_climatico.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherResponse {

  private double temperatura;
  private int humedad;
  private String descripcion;
  // Despues registramos fecha internamente

}