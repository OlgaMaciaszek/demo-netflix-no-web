package com.example.demonetflixnoweb;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoNetflixNoWebApplication implements CommandLineRunner {

	@Autowired
	RestTemplate restTemplate;

	public static void main(String[] args) {
//		new SpringApplicationBuilder(DemoNetflixNoWebApplication.class)
//				.web(WebApplicationType.NONE)
//				.run(args);

		SpringApplication.run(DemoNetflixNoWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String response = restTemplate.getForObject(URI.create("http://test-service"), String.class);
		System.out.println(response);
	}
}


