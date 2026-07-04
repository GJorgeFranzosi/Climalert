package ar.edu.utn.ba.ddsi.sistema_climatico.observer;

import ar.edu.utn.ba.ddsi.sistema_climatico.domain.Alerta;

import java.util.ArrayList;
import java.util.List;

public class GestorAlertas {
  private final List<ObservadorAlerta> observadores = new ArrayList<>();

  public void suscribir(ObservadorAlerta observador) {
    observadores.add(observador);
  }
  public void desuscribir(ObservadorAlerta observador) {
    observadores.remove(observador);
  }
  public void notificar(Alerta alerta) {
    observadores.forEach(observador -> observador.actualizar(alerta));
  }
}