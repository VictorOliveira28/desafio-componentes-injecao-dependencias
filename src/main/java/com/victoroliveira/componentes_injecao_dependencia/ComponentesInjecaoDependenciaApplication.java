package com.victoroliveira.componentes_injecao_dependencia;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComponentesInjecaoDependenciaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ComponentesInjecaoDependenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello, world!");
		
	}

}
