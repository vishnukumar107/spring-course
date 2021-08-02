package com.vishnu.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	public TrackCoach() {
		
	}
	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 6k";
	}

	@Override
	public String getDailyFortune() {
		return  "Just Do It: " + fortuneService.getFortune();
		
	}
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach : inside method doMyStartupStuff");
	}
	
	public void doMycleanupStuff() {
		System.out.println("TrackCoach : inside method doMycleanupStuff");
	}
	

}
