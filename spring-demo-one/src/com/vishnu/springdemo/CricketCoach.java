package com.vishnu.springdemo;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	private String emailAddress;
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}

	private String team;
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg contructor");
	}
	
	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method -setFortuneService");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		
		return "Face 100 balls in the nets";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
