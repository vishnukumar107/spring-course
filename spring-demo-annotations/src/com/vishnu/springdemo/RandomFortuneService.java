package com.vishnu.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {"today will be lucky day" , " happy always", " hardwork pays off" };
	private Random rand = new Random();
	@Override
	public String getFortune() {
		 int ind = rand.nextInt(data.length);
		 return data[ind];
		
	}

}
