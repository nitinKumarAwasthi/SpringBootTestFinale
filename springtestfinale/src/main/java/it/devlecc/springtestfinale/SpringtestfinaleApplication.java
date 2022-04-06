package it.devlecc.springtestfinale;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringtestfinaleApplication {
	private static final Logger logger = LoggerFactory
			.getLogger(SpringtestfinaleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringtestfinaleApplication.class, args);
		logger.debug("Test finale di Spring Boot Application");
	}
}
