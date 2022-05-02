package com.startjava.Lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите имя первого игрока : ");
		String name1 = scan.nextLine();
		Player player1 = new Player(name1);
		
		System.out.print("Введите имя второго игрока: ");
		String name2 = scan.nextLine();
		Player player2 = new Player(name2);
		
		GuessNumber game = new GuessNumber(player1, player2);
		
		String answer = "yes";
		
		do {
			if (answer.equals("yes")) {
			game.start();
			}
			System.out.print("Хотите продолжить игру? [yes/no]: ");
			answer = scan.nextLine();
			
		} while (!answer.equals("no"));
	}
}		