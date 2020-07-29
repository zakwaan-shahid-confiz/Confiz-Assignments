package com.example.SBAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan("com.example.SBAssignment")
public class SbAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbAssignmentApplication.class, args);
	}

}
