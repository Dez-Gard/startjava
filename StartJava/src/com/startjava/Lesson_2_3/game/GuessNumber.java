package com.startjava.Lesson_2_3.game;

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
			System.out.print(pl1.getName() + ", ������� �����: ");
			int myNum = scan.nextInt();
			if (myNum == compNum) {
				System.out.println("������� ����� " + pl1.getName());
				break;
			} else if (myNum > compNum) {
				System.out.println(myNum + " - ������ �����������");
			} else if (myNum < compNum) {
				System.out.println(myNum + " - ������ �����������");
			}
			
			System.out.print(pl2.getName() + ", ������� �����: ");
			myNum = scan.nextInt();
			if (myNum == compNum) {
				System.out.println("������� ����� " + pl2.getName());
				break;
			} else if (myNum > compNum) {
				System.out.println(myNum + " - ������ �����������");
			} else if (myNum < compNum) {
				System.out.println(myNum + " - ������ �����������");
			}
		}
	}
}