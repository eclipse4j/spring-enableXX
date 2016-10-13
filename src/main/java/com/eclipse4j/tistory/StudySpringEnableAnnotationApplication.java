package com.eclipse4j.tistory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eclipse4j.tistory.example.configurations.EnableRestTemplate;

@EnableRestTemplate
@SpringBootApplication
public class StudySpringEnableAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudySpringEnableAnnotationApplication.class, args);
	}
}
