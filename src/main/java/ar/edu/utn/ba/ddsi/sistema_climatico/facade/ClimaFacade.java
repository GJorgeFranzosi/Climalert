package ar.edu.utn.ba.ddsi.sistema_climatico.facade;

import ar.edu.utn.ba.ddsi.sistema_climatico.adapter.ClimaAdapter;
import ar.edu.utn.ba.ddsi.sistema_climatico.domain.Clima;
import ar.edu.utn.ba.ddsi.sistema_climatico.dto.WeatherResponse;
import ar.edu.utn.ba.ddsi.sistema_climatico.service.AnalizadorClimatico;
import ar.edu.utn.ba.ddsi.sistema_climatico.client.WeatherApiClient;
import ar.edu.utn.ba.ddsi.sistema_climatico.service.RegistroClimatico;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClimaFacade {
  private final WeatherApiClient weatherApiClient;
  private final ClimaAdapter climaAdapter;
  private final RegistroClimatico registroClimatico;
  private final AnalizadorClimatico analizadorClimatico;

  public void actualizarClima() {
    WeatherResponse response = weatherApiClient.obtenerClimaActual();
    Clima clima = climaAdapter.adaptar(response);
    registroClimatico.guardar(clima);
  }

  public void analizarUltimoClima() {
    Clima clima = registroClimatico.obtenerUltimo();
    analizadorClimatico.analizar(clima);
  }
}