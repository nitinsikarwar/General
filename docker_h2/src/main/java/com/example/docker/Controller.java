package com.example.docker;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	private final MyRepository mr;
	public Controller (MyRepository mr) {
		this.mr =  mr;
	}
	
	@GetMapping("/get")
	  public List<MyEntity> getAllBuses() {
       return mr.findAll();
  }
}
