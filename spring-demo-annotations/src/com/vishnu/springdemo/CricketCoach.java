package com.vishnu.springdemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice bowling for 30 minutes";
	}


	@Override
	public String getDailyFortune() {
		
		return null;
	}

}
