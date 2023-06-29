package br.com.r25ta.spiritual_care_backend;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.r25ta.spiritual_care_backend.model.Goer;
import br.com.r25ta.spiritual_care_backend.model.Worker;
import br.com.r25ta.spiritual_care_backend.repository.GoerRepository;
import br.com.r25ta.spiritual_care_backend.repository.WorkerRepository;

@SpringBootApplication
public class SpiritualCareBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpiritualCareBackendApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase(WorkerRepository workRepository, GoerRepository goerRepository){
		return args -> {
			workRepository.deleteAll();

			Worker w1 = new Worker();
			w1.setId(UUID.randomUUID());
			w1.setName("Ronaldo");
			w1.setNickName("R25ta");
			w1.setPhone("11983267932");
			w1.setBorn(LocalDate.parse("03/02/1978",DateTimeFormatter.ofPattern("dd/MM/yyyy")));

			workRepository.save(w1);
		
			goerRepository.deleteAll();
			Goer g1 = new Goer();
			g1.setId(UUID.randomUUID());
			g1.setName("João");
			g1.setPhone("112083025");
			g1.setBorn(LocalDate.parse("01/01/1970",DateTimeFormatter.ofPattern("dd/MM/yyyy")));

			goerRepository.save(g1);
		};
	}
}
