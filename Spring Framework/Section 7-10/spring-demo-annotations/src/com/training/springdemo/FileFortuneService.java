package com.training.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private String fileName = "src\\fortunes.txt";
	
	private List<String> fortuneList = new ArrayList<>();
	
	// create a random number generator
	private Random myRandom = new Random();
	
	@PostConstruct
	public void FileFortuneService() {
		
		System.out.println(">> FileFortuneService: inside method loadTheFortunesFile");
		
		File theFile = new File(fileName);
		
		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("File exists: " + theFile.exists());
		
		try(BufferedReader br = new BufferedReader(
				new FileReader(theFile))) {

			String tempLine;

			while ((tempLine = br.readLine()) != null) {
				fortuneList.add(tempLine);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(fortuneList.size());

		String tempFortune = fortuneList.get(index);

		return tempFortune;
	}


}
