package com.startjava.Lesson_1.game;

public class MyFirstGame {

	public static void main(String[] args) {

		int computerNumber = 67;
		int myNumber = 50;

		System.out.println("��������!");

		while (myNumber != computerNumber) {
			if (myNumber > computerNumber) {
				System.out.println(myNumber + " ������ ����� ������ ����, ��� ������� ���������");
				myNumber--;
			}
			if (myNumber < computerNumber) {
				System.out.println(myNumber + " ������ ����� ������ ����, ��� ������� ���������");
				myNumber++;
			}
		}
		System.out.println("�� �������! ��� ����� " + computerNumber);
	}
}
