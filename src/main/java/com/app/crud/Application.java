package com.app.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.crud.entidad.Estudiante;
import com.app.crud.repositorio.EstudianteRepositorio;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private EstudianteRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {
		// Estudiante estudiante1 = new Estudiante("Gaston", "Valles", "valles.gastond@hotmail.com");
		// repositorio.save(estudiante1);

		// Estudiante estudiante2 = new Estudiante("David", "Perez", "perez2020@hotmail.com");
		// repositorio.save(estudiante2);

	}

}
