package ru.edu.datajpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.edu.datajpa.services.EmployeeService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private final EmployeeService service;

	public Application(EmployeeService service) {
		this.service = service;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		service.test();
	}

}
