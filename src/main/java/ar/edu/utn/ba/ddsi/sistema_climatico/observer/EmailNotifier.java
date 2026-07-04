package ar.edu.utn.ba.ddsi.sistema_climatico.observer;

import ar.edu.utn.ba.ddsi.sistema_climatico.domain.Alerta;

public class EmailNotifier implements ObservadorAlerta {

  @Override
  public void actualizar(Alerta alerta) {
    //TODO: dsp implemento con JavaMailSender
    System.out.println("Enviando mail...");
    System.out.println("Temperatura: " + alerta.getClima().getTemperatura());
    System.out.println("Humedad: " + alerta.getClima().getHumedad());
  }
}