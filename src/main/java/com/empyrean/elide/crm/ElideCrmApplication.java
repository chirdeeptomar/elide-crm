package com.empyrean.elide.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EntityScan
public class ElideCrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElideCrmApplication.class, args);
	}

}
