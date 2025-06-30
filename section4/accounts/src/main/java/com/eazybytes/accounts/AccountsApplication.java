package com.eazybytes.accounts;

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
				title = "Accounts mircroservices REST API documentation",
				description = "EazyBank Accounts microservices REST API Documentation.",
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
				description = "EazyBank Accounts microservices REST API Documentation.",
				url = "http://example.com.bo"
		)

)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
