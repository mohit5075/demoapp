package com.azentio.hackathon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
	@Bean
	public Coach swimClass() {
		return new SwimClass();
	}
}
