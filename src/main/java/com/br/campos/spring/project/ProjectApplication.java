package com.br.campos.spring.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot -  Bootcamp da DIO - GFT JAVA
 * Modulos Utilizados:
 * Spring Data JPA
 * Spring Web
 * H2 Database
 * OpenFeign
 *
 * @author DinhoDKK
 *
 */
@EnableFeignClients
@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}


}
