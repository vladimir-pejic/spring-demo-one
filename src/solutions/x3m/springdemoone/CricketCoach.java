package solutions.x3m.springdemoone;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor.");
	}

	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside the setter method.");
		this.fortuneService = fortuneService;
	}

	
	@Override
	public String getDailyWorkout() {
		return "Keep hitting it!";
	}

	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
