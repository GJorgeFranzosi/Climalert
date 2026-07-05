package ar.edu.utn.ba.ddsi.sistema_climatico.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CondicionClimatica {
  private String text;
}