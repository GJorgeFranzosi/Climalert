package ar.edu.utn.ba.ddsi.sistema_climatico.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "weather.api")
public class WeatherApiProperties {
  private String url;
  private String key;
  private String city;
}