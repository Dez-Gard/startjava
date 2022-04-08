package com.startjava.Lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������� ��� ������� ������: ");
		String name1 = scan.nextLine();
		Player player1 = new Player(name1);
		
		System.out.print("������� ��� ������� ������: ");
		String name2 = scan.nextLine();
		Player player2 = new Player(name2);
		
		GuessNumber game = new GuessNumber(player1, player2);
		
		String answer = "yes";
		
		do {
			if (answer.equals("yes")) {
			game.start();
			}
			System.out.print("������ ���������� ����������? [yes/no]: ");
			answer = scan.nextLine();
			
		} while (!answer.equals("no"));
	}
}		