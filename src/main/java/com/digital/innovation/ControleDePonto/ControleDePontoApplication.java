package com.digital.innovation.ControleDePonto;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@SpringBootApplication
@Configuration
public class ControleDePontoApplication {

	public static void main(String[] args) {

		SpringApplication.run(ControleDePontoApplication.class, args);
	}

	@Bean
	public OpenAPI customOpenApi(@Value("Controle de Ponto") String description){
		return new OpenAPI()

				.info(new Info()
						.title(description)
						.version("1.0.0")
						.termsOfService("http://swagger.io/terms")
						.license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}





}
