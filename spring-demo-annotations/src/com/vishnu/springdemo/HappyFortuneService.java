package com.vishnu.springdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	
	private String filename = "/Users/vishnukumar/Documents/Eclipse-Workspace/spring-demo-annotations/src/com/vishnu/springdemo/fortune.txt";
	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}
	
	@PostConstruct
	public void startUpStuff() {
		try {
			File myObj = new File(filename);
			Scanner myReader = new Scanner(myObj);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println("fortune for the day :" + data);
			}
			myReader.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found!!");
			e.printStackTrace();
		}
		
	}
	
}
