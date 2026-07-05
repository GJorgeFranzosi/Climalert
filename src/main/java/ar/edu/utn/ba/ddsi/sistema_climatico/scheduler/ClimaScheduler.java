package ar.edu.utn.ba.ddsi.sistema_climatico.scheduler;

import ar.edu.utn.ba.ddsi.sistema_climatico.facade.ClimaFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ClimaScheduler {

  private final ClimaFacade climaFacade;

  @Scheduled(fixedRate = 10000) //10s
  public void actualizarClima() {
    climaFacade.actualizarClima();
  }

  @Scheduled(fixedRate = 15000) //15s
  public void analizarUltimoClima() {
    climaFacade.analizarUltimoClima();
  }
}