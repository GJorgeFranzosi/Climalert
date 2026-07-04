package ar.edu.utn.ba.ddsi.sistema_climatico.service;

import ar.edu.utn.ba.ddsi.sistema_climatico.domain.Alerta;
import ar.edu.utn.ba.ddsi.sistema_climatico.domain.Clima;
import ar.edu.utn.ba.ddsi.sistema_climatico.observer.GestorAlertas;
import ar.edu.utn.ba.ddsi.sistema_climatico.strategy.EstrategiaAlerta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnalizadorClimatico {
  private final EstrategiaAlerta estrategia;
  private final GestorAlertas gestorAlertas;


  public void analizar(Clima clima) {
    if (estrategia.esCondicionCritica(clima)) {
      gestorAlertas.notificar(new Alerta(clima));
    }
  }
}