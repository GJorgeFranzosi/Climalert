package ar.edu.utn.ba.ddsi.sistema_climatico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SistemaClimaticoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaClimaticoApplication.class, args);
	}
}
