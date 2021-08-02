package com.vishnu.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.vishnu.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	@Bean
	public FortuneService sadFortuneService() {
		return new sadFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
