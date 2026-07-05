package ar.edu.utn.ba.ddsi.sistema_climatico.config;

import ar.edu.utn.ba.ddsi.sistema_climatico.observer.EmailNotifier;
import ar.edu.utn.ba.ddsi.sistema_climatico.observer.GestorAlertas;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class ObserverConfig {

  private final GestorAlertas gestorAlertas;
  private final EmailNotifier emailNotifier;

  @PostConstruct
  public void configurar() {
    gestorAlertas.suscribir(emailNotifier);
  }
}