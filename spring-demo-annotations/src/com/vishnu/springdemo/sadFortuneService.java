package com.vishnu.springdemo;

public class sadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is a sad day";
	}

}
