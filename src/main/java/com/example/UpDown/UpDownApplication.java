package com.example.UpDown;

import com.example.UpDown.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({FileStorageProperties.class})
public class UpDownApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpDownApplication.class, args);
	}

}

