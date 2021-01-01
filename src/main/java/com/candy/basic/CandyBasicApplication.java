package com.candy.basic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.candy.basic")
@MapperScan("com.candy.basic.mapper")
public class CandyBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(CandyBasicApplication.class, args);
	}

}
