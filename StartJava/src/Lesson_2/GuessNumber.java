package Lesson_2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	
	private Player pl1;
	private Player pl2;
	
	public GuessNumber(Player pl1, Player pl2) {
	this.pl1 = pl1;
	this.pl2 = pl2;
	}
	
	public void start() {
		Random rnd = new Random();
		int compNum = rnd.nextInt(100 + 1);
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print(pl1.getName() + ", введите число: ");
			int myNum = scan.nextInt();
			if (myNum == compNum) {
				System.out.println("Победил игрок " + pl1.getName());
				break;
			} else if (myNum > compNum) {
				System.out.println(myNum + " - БОЛЬШЕ загаданного");
			} else if (myNum < compNum) {
				System.out.println(myNum + " - МЕНЬШЕ загаданного");
			}
			
			System.out.print(pl2.getName() + ", введите число: ");
			myNum = scan.nextInt();
			if (myNum == compNum) {
				System.out.println("Победил игрок " + pl2.getName());
				break;
			} else if (myNum > compNum) {
				System.out.println(myNum + " - БОЛЬШЕ загаданного");
			} else if (myNum < compNum) {
				System.out.println(myNum + " - МЕНЬШЕ загаданного");
			}
		}
	}
}