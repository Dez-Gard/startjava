package Lesson_2;

import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("¬ведите им€ первого игрока: ");
		String name1 = scan.nextLine();
		Player player1 = new Player(name1);
		
		System.out.print("¬ведите им€ второго игрока: ");
		String name2 = scan.nextLine();
		Player player2 = new Player(name2);
		
		GuessNumber game = new GuessNumber(player1, player2);
		
		String answer = "yes";
		
		do {
			if (answer.equals("yes")) {
			game.start();
			}
			System.out.print("’отите продолжить вычислени€? [yes/no]: ");
			answer = scan.nextLine();
			
		} while (!answer.equals("no"));
	}
}		