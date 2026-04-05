package com.example.docker;

import org.h2.tools.Server;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class DockerApplication {

    private final Controller controller;


    DockerApplication(Controller controller) {
        this.controller = controller;
    }


		public static void main(String[] args) {
			SpringApplication.run(DockerApplication.class, args);
		}
		

}
