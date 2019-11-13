package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class UService2Application {

	@Autowired
	@Lazy
	private EurekaClient eurekaClient;

	public static void main(String[] args) {
		SpringApplication.run(UService2Application.class, args);
	}

	@RequestMapping("/greeting")
	public String greeting() {
		return "Hello from uService 2...";
	}
}
