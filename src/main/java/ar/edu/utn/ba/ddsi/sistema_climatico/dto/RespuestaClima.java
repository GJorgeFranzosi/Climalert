package ar.edu.utn.ba.ddsi.sistema_climatico.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RespuestaClima {

  @JsonProperty("current")
  private ClimaActual climaActual;
}