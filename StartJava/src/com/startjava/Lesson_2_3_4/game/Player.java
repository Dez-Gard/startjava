package com.startjava.Lesson_2_3_4.game;

public class Player {
	
	private final String name;

	int[] inputNumPlr1 = new int[5];
	int[] inputNumPlr2 = new int[5];
	int[] inputNumPl3 = new int[5];

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}