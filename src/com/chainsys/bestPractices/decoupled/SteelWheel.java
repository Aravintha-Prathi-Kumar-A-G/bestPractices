package com.chainsys.bestPractices.decoupled;

public class SteelWheel implements Iwheel{
	public String location;
	public void rotate()
	{
		System.out.println("Steel Wheel Rotating");
	}
	public void stopRotate()
	{
		System.out.println("Steel Wheel Stopped");
	}

}
