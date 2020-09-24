package com.java.dockerjenkinsintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinsIntegrationApplication {

	public static void main(String[] args) {
		System.out.println("Hi I'm working");
		SpringApplication.run(DockerJenkinsIntegrationApplication.class, args);
	}

}
