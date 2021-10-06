package com.example.demo;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GestionCandidatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionCandidatsApplication.class, args);
	}
	@Bean
	ApplicationRunner init(CandidatRepository repository) {
		return args-> {
			Stream.of("Mariem","Mohamed","Brahim").forEach(nom -> {
				repository.save(new Candidate(nom));
			});
			repository.findAll().forEach(System.out::println);
		};
		
		
		
	}
	

}
