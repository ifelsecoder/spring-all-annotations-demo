package com.example.annotations;

import com.example.annotations.util.MyLogger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan("com.example.annotations.database.sqlite.model")
@EnableJpaRepositories("com.example.annotations.database.sqlite.repository")
public class SpringAllAnnotationsApplication {

	private static final String ANNOTATIONS = " [ANNOTATIONS:  " +
													"@EnableJpaRepositories, @EntityScan, @SpringBootApplication" +
										       "]";

	public static void main(String[] args) {
		MyLogger.log("SpringAllAnnotationsApplication, main - called" + ANNOTATIONS);

		SpringApplication.run(SpringAllAnnotationsApplication.class, args);
	}
}
