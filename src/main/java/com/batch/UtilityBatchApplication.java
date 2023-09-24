package com.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class UtilityBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtilityBatchApplication.class, args);
	}

	@Scheduled(fixedRate = 5000)
	void print() {
		System.out.println("Hey Donny");
	}
}
