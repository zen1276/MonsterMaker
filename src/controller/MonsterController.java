package controller;

import model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController
{
	//Data member section
	private MarshmallowMonster myMonster;
	
	//Constructor section
	public MonsterController()
	{
		//Job1: initialize data members
		myMonster = new MarshmallowMonster("BillyBobAbortion", 1.5, 1, false, 3);
	}
	
	//methods section

	
	
	
	
	public void start()
	{
		Scanner inputScanner;
		
		System.out.println("What is the name of your monster?");
		inputScanner = new Scanner(System.in);
		String name = inputScanner.nextLine();
		
		System.out.println("How many legs will your monster have?");
		inputScanner = new Scanner(System.in);
		double legCount = inputScanner.nextDouble();
		
		System.out.println("What is the number of eyes your monster has?");
		inputScanner = new Scanner(System.in);
		int eyeCount = inputScanner.nextInt();
		
		System.out.println("Is your monster going to have any noses? true/false");
		inputScanner = new Scanner(System.in);
		boolean hasNoses = inputScanner.nextBoolean();
		
		System.out.println("How many arms does your monster have?");
		inputScanner = new Scanner(System.in);
		int armCount = inputScanner.nextInt();
		
		inputScanner.close();
		
		
		//System.out.println(myMonster);
		//myMonster.setArmCount(9999);
		//System.out.println("My monster has this many arms: " + myMonster.getArmCount() );
	
		//Make a new monster and customize from user input
		MarshmallowMonster userMonster;
		userMonster = new MarshmallowMonster(name, legCount, eyeCount, hasNoses, armCount);
		System.out.println(userMonster);
	}
}
