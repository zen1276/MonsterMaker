package controller;

import model.MarshmallowMonster;
import java.util.Scanner;
import javax.swing.JOptionPane;

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
		
		JOptionPane.showMessageDialog(null, "show a message \nhere :3");
		//use this method instead of System.out.println("words words words");
		
		System.out.println("What is the name of your monster?");
		String name = JOptionPane.showInputDialog(null, "What is the name of your monster?");
		inputScanner = new Scanner(System.in);
		String name = inputScanner.nextLine();
		
		System.out.println("How many legs will your monster have?");
		double legCount = JOptionPane.showInputDialog(null, "How many legs will your monster have?");
		inputScanner = new Scanner(System.in);
		double legCount = inputScanner.nextDouble();
		
		System.out.println("How many eyes does your monster have?");
		int eyeCount = JOptionPane.showInputDialog(null, "How many eyes does your monster have?");
		inputScanner = new Scanner(System.in);
		int eyeCount = inputScanner.nextInt();
		
		System.out.println("Is your monster going to have any noses? true/false");
		boolean hasNoses = JOptionPane.showInputDialog(null, "Is your monster going to have any noses? true/false");
		inputScanner = new Scanner(System.in);
		boolean hasNoses = inputScanner.nextBoolean();
		
		System.out.println("How many arms does your monster have?");
		int armCount = JOptionPane.showInputDialog(null, "How many arms does your monster have?");
		inputScanner = new Scanner(System.in);
		int armCount = inputScanner.nextInt();
		
		inputScanner.close();
		
		
		System.out.println(myMonster);
		JOptionPane.showMessageDialog(null,  myMonster);
		myMonster.setArmCount(9999);
		System.out.println("My monster has this many arms: " + myMonster.getArmCount() );
		JOptionPane.showMessageDialog(null,"My monster has this many arms: " + myMonster.getArmCount());
	
		//Make a new monster and customize from user input
		MarshmallowMonster userMonster;
		userMonster = new MarshmallowMonster(name, legCount, eyeCount, hasNoses, armCount);
		System.out.println(userMonster);
		JOptionPane.showMessageDialog(null, userMonster);
	}
	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Please type a valid\ninteger value");
		}
		
		return isValid;
	}
	
	public boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(maybeDouble);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "This requires a double value");
		}
		
		return isValid;
	}
	
}
