package controller;

import model.MarshmallowMonster;

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
		System.out.println(myMonster);
	}
}
