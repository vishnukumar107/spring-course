package com.vishnu.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//
//		this.fortuneService = fortuneService;
//	}
	public TennisCoach() {
		System.out.println("TennisCoach : inside default constructor");
	}
	
	@PostConstruct
	public void doMyStartupStuff(){
		System.out.println("TennisCoach : Inside doMyStartStuff");
		
	}
	
	@PreDestroy
	public void doMyCleanupStuff(){
		System.out.println("TennisCoach : Inside doMyCleanupStuff");
		
	}
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println("TennisCoach : inside doSomeCrazyStuff ");
		this.fortuneService = fortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		
		return "Practice making serve for 20 minutes";
	}

	

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
