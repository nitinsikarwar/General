package com.example.docker_consumer;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;


	@RestController
	public class Controller {
	 
	    private final RestTemplate restTemplate;

	    @Value("${PRODUCER_URL:http://provider:8888/get}")
	    private String producerUrl;
	 
	    public Controller(RestTemplateBuilder builder) {
	        this.restTemplate = builder.build();
	    }
	 
	    @GetMapping("/fetch")
	    public Object fetchData() {
	        String url = "http://localhost:8888/get"; // Provider container name used as hostname
	        return restTemplate.getForObject(producerUrl, Object.class);
	    }
	}
	
	
	

