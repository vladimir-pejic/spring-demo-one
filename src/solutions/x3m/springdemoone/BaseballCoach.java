package solutions.x3m.springdemoone;

public class BaseballCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes practicing";
	}

	@Override
	public String getDailyFortune() {
		// use fortuneService from constructor
		return fortuneService.getFortune();
	}
	
}
