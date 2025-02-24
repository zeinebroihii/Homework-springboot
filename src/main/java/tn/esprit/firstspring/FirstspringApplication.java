package tn.esprit.firstspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "tn.esprit.firstspring.services")  // Explicitly scan the services package

public class FirstspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstspringApplication.class, args);
	}

}
