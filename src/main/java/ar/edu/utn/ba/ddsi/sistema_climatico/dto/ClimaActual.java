package ar.edu.utn.ba.ddsi.sistema_climatico.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimaActual {

  @JsonProperty("temp_c")
  private double temperatura;

  @JsonProperty("humidity")
  private int humedad;

  @JsonProperty("condition")
  private CondicionClimatica condicionClimatica;
}