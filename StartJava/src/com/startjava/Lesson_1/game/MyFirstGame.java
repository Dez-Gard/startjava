package com.startjava.Lesson_1.game;

public class MyFirstGame {

	public static void main(String[] args) {

		int computerNumber = 67;
		int myNumber = 50;

		System.out.println("Стартуем!");

		while (myNumber != computerNumber) {
			if (myNumber > computerNumber) {
				System.out.println(myNumber + " Данное число больше того, что загадал компьютер");
				myNumber--;
			}
			if (myNumber < computerNumber) {
				System.out.println(myNumber + " Данное число меньше того, что загадал компьютер");
				myNumber++;
			}
		}
		System.out.println("Вы угадали! Это число " + computerNumber);
	}
}
