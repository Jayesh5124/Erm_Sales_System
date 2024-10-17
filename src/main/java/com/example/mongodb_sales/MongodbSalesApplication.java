package com.example.mongodb_sales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.example.mongodb_sales", "com.speedment.jpastreamer"})
public class MongodbSalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodbSalesApplication.class, args);
	}

}
