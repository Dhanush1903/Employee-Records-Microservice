package com.rec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RecordMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecordMicroserviceApplication.class, args);
	}

}
