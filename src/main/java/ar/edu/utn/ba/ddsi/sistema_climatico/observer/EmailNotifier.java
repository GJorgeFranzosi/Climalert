package ar.edu.utn.ba.ddsi.sistema_climatico.observer;

import ar.edu.utn.ba.ddsi.sistema_climatico.domain.Alerta;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmailNotifier implements ObservadorAlerta {
  private final JavaMailSender mailSender;

  @Override
  public void actualizar(Alerta alerta) {
    SimpleMailMessage mensaje = new SimpleMailMessage();
    mensaje.setTo(
        "admin@clima.com",
        "emergencias@clima.com",
        "meteorologia@clima.com"
    );
    mensaje.setSubject("Alerta Climática");
    mensaje.setText(
        "Se detectó una alerta climática.\n\n" +
            "Temperatura: " + alerta.getClima().getTemperatura() + " °C\n" +
            "Humedad: " + alerta.getClima().getHumedad() + " %\n" +
            "Descripción: " + alerta.getClima().getDescripcion() + "\n" +
            "Fecha: " + alerta.getFecha()
    );
    mailSender.send(mensaje);
  }
}