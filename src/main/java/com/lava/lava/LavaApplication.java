package com.lava.lava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
public class LavaApplication {
    private static final Logger logger = LogManager.getLogger(LavaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LavaApplication.class, args);
        logger.info("🚀 Lava Payroll Management System started successfully!");
	}

}
