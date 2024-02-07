package com.azentio.hackathon;

import org.springframework.stereotype.Component;

@Component
//making a class component act as spring bean and will make it available for dependency injection
public class CricketCoach implements Coach {

	public CricketCoach() {
		System.out.println("In constructor: " + getClass().getSimpleName());
	}

//	@PostConstruct
//	public void postconstructfunction() {
//		System.out.println("Called after constructor of CricketCoach");
//	}
//	
//	@PreDestroy
//	public void afterDestroying() {
//		System.out.println("Called after instance destroyed");
//	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice fast bowling for 15 minutes!!!-)";
	}

}
