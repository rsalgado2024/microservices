package com.eazybytes.loans;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservices REST API Documentation",
				description = "EazyBank Loans microservices REST API Documentation",
				version = "V1",
				contact = @Contact(
						name = "Madam Quenn",
						email = "example@com.bo",
						url = "http://example.com.bo"
				),
				license = @License(
						name = "Apache 3.0",
						url = "http://example.com.bo"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "EazyBank Loans microservices REST API Documentation",
				url = "http://example.com.bo"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}

}

