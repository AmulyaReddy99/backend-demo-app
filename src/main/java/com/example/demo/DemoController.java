package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

	@Autowired DemoService demoService;

	@GetMapping("/hello")
	public String sayHello() {
		demoService.process();
		return "Processed";
	}
}
