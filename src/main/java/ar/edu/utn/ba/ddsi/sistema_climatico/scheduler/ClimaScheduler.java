package ar.edu.utn.ba.ddsi.sistema_climatico.scheduler;

import ar.edu.utn.ba.ddsi.sistema_climatico.facade.ClimaFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ClimaScheduler {
  private final ClimaFacade climaFacade;

  //@Scheduled(fixedRate = 300000) // a los cinco minutos
  Scheduled(fixedRate = 10000)
  public void actualizarClima() {
    climaFacade.actualizarClima();
  }
  //@Scheduled(fixedRate = 60000) // al minuto
  Scheduled(fixedRate = 15000)
  public void analizarUltimoClima() {
    climaFacade.analizarUltimoClima();
  }
}