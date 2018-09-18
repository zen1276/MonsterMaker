package controller;

import model.MarshmallowMonster;
//import java.util.Scanner;
import javax.swing.JOptionPane;

public class MonsterController
{
	//----------Data member section
	private MarshmallowMonster myMonster;
	private MarshmallowMonster userMonster;
	
	//------------Constructor section
	public MonsterController()
	{
		//----------Job1: initialize data members
		myMonster = new MarshmallowMonster("BillyBobAbortion", 1.5, 1, false, 3);
		userMonster = new MarshmallowMonster();
	}
	
	//---------methods section

	
	
	
	
	public void start()
	{
//		Scanner inputScanner;
		
		JOptionPane.showMessageDialog(null, "show a message \nhere :3");
		//--------------use this method instead of System.out.println("words words words");
		
//		System.out.println("What is the name of your monster?");
		String name = JOptionPane.showInputDialog(null, "What is the name of your monster?");
		userMonster.setName(name);
//		inputScanner = new Scanner(System.in);
//		String name = inputScanner.nextLine();
		
//		System.out.println("How many legs will your monster have?");
		String legCount = JOptionPane.showInputDialog(null, "How many legs will your monster have?");
//		inputScanner = new Scanner(System.in);
//		double legCount = inputScanner.nextDouble();
		if (validInt(legCount))
		{
			int legs = Integer.parseInt(legCount);
			userMonster.setLegCount(legs);
		}
		
//		System.out.println("How many eyes does your monster have?");
		String eyeCount = JOptionPane.showInputDialog(null, "How many eyes does your monster have?");
//		inputScanner = new Scanner(System.in);
//		int eyeCount = inputScanner.nextInt();
		if (validInt(eyeCount))
		{
			int eyes = Integer.parseInt(eyeCount);
			userMonster.setEyeCount(eyes);
		}
		
//		System.out.println("Is your monster going to have any noses? true/false");
		String hasNoses = JOptionPane.showInputDialog(null, "Is your monster going to have any noses? true/false");
//		inputScanner = new Scanner(System.in);
//		boolean hasNoses = inputScanner.nextBoolean();		
		
//		System.out.println("How many arms does your monster have?");
		String armCount = JOptionPane.showInputDialog(null, "How many arms does your monster have?");
//		inputScanner = new Scanner(System.in);
//		int armCount = inputScanner.nextInt();
		int arms = 0;
		if (validInt(armCount))
		{
			arms = Integer.parseInt(armCount);
			userMonster.setArmCount(arms);
		}
		if (arms == 2)
		{
			JOptionPane.showMessageDialog(null, "wow, you're boring... 2 arms. W   O   W");
		}
		else if (arms < 2)
		{
			JOptionPane.showMessageDialog(null, "well that's not very convenient. What is it gonna do with that many arms?");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "slow down there buckaroo, that seems like a few too many arms.");
		}
		
//		inputScanner.close();
		
		
//		System.out.println(myMonster);
		JOptionPane.showMessageDialog(null,  myMonster);
		myMonster.setArmCount(9999);
//		System.out.println("My monster has this many arms: " + myMonster.getArmCount() );
		JOptionPane.showMessageDialog(null,"My monster has this many arms: " + myMonster.getArmCount());
	
		//--------Make a new monster and customize from user input

//		MarshmallowMonster userMonster;
//		userMonster = new MarshmallowMonster();
//		System.out.println(userMonster);
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
