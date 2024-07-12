package com.training.messaging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class MessagingApiAppApplication {
	
	public static String greeting(){
		return "Hi Oracle!";
	}
	
	@GetMapping("/happyweekend")
	public String weekend() {
		return "Happy Weekend Everyone";
	}

	public static void main(String[] args) {
		SpringApplication.run(MessagingApiAppApplication.class, args);
		System.out.println(greeting());
		System.out.println("This app has no testing");
		
		
	}

}
