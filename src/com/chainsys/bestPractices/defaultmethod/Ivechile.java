package com.chainsys.bestPractices.defaultmethod;

public interface Ivechile
{
	void start();
	default void move()
	{
		System.out.println("Vechile is moving");
	}

}
