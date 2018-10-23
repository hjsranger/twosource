package com.idgcapital;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.idgcapital.rfund")
@ComponentScan(basePackages = "com.idgcapital")
@SpringBootApplication
public class RfunddataApplication {

	public static void main(String[] args) {
		SpringApplication.run(RfunddataApplication.class, args);
	}
}
