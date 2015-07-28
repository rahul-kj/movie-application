package io.rahul.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProducerStartupApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProducerStartupApplication.class, args);
	}
}
