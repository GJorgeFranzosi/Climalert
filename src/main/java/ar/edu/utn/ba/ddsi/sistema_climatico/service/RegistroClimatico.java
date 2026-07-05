package ar.edu.utn.ba.ddsi.sistema_climatico.service;

import ar.edu.utn.ba.ddsi.sistema_climatico.domain.Clima;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class RegistroClimatico {
  //Guardar los registros en memoria
    private final List<Clima> historial = new ArrayList<>();

    public void guardar(Clima clima) {
      historial.add(clima);
    }
    public Clima obtenerUltimo() {
      if (historial.isEmpty()) {
        return null;
      }
      return historial.get(historial.size() - 1);
    }
    public List<Clima> obtenerHistorial() {
      return historial;
    }
}
