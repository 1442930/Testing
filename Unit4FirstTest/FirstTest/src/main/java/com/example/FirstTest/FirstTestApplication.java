package com.example.FirstTest;

import com.example.FirstTest.page.google.FlightsPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class FirstTestApplication {
	public static void main(String[] args) {
		SpringApplication.run(FirstTestApplication.class, args);
	}

}
