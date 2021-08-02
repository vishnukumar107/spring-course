package com.vishnu.springdemo;

import java.util.Random;

public class RandomFortune implements FortuneService {

	@Override
	public String getFortune() {
		String[] arr = {"today is a better day","It is a nice day","you will get a fortune today"};
		Random rand = new Random();

		int r = rand.nextInt(arr.length);
		return arr[r];
	}

}
