package Lesson_1;

public class IfElseStatementTheme {

	public static void main(String[] args) {

		int age = 19;
		boolean male = false;
		double height = 1.80;
		char firstLetterOfTheName;
		if (age > 20) {
			System.out.println("� ��������!");
		} else {
			System.out.println("��� ����� ��������...");
		}
		if (!male) {
			System.out.println("� �� �����!?");
		}
		if (height < 1.80) {
			System.out.println("� �������.");
		} else {
			System.out.println("� ������.");
		}
		firstLetterOfTheName = "Igor".charAt(0);
		if (firstLetterOfTheName == 'M') {
			System.out.println("�� �������� ������.");
		} else if (firstLetterOfTheName == 'I') {
			System.out.println("�� �������� �����.");
		} else {
			System.out.println("� ������.");
		}

		int num1 = 796;
		int num2 = 81;
		if (num1 > num2) {
			System.out.println("������������ ����� " + num1);
			System.out.println("����������� ����� " + num2);
		} else if (num2 > num1) {
			System.out.println("������������ ����� " + num2);
			System.out.println("����������� ����� " + num1);
		}

		int i1 = 33;
		if (i1 % 2 == 0) {
			System.out.println("���� ����� ������");
		} else {
			System.out.println("���� ����� �� ������");
		}
		if (i1 > 0) {
			System.out.println("���� ����� �������������");
		} else if (i1 == 0) {
			System.out.println("���� ����� 0");
		} else {
			System.out.println("���� ����� �������������");
		}

		String one = "345";
		String two = "543";
		if (one.charAt(1) == two.charAt(1)) {
			System.out.println("��� ���������� ����� - " + one.charAt(1));
		} else {
			System.out.println("���������� �� �������");
		}

		char oct = '\u005A';
		int ascii = (int) oct;
		System.out.println("� ���������� �.�. ����� " + ascii);
		System.out.println("���� ASCII ����� " + oct);

		int deposit = 300000;
		if (deposit < 100000 || deposit == 100000) {
			int rate = (int) ((deposit * 0.05) / 12);
			System.out.println(deposit + " " + rate + " " + (deposit + rate));
		} else if (deposit < 300000 || deposit == 300000) {
			int rate = (int) ((deposit * 0.07) / 12);
			System.out.println(deposit + " " + rate + " " + (deposit + rate));
		} else if (deposit > 300000) {
			int rate = (int) ((deposit * 0.1) / 12);
			System.out.println(deposit + " " + rate + " " + (deposit + rate));
		}

		int history = 59;
		int programing = 91;
		if (history > 91) {
			System.out.println("5 - �������. " + "������� ��� - " + ((5 / 0.91) * history / 100)
					+ " ������� % �� �������� - " + history);
		} else if (history > 73) {
			System.out.println("4 - �������. " + "������� ��� - " + ((4 / 0.73) * history / 100)
					+ " ������� % �� �������� - " + history);
		} else if (history > 60) {
			System.out.println("3 - �������. " + "������� ��� - " + ((3 / 0.6) * history / 100)
					+ " ������� % �� �������� - " + history);
		} else if (history < 60) {
			System.out.println("2 - ������� " + "������� ��� - " + ((3 / 0.6) * history / 100)
					+ " ������� % �� �������� - " + history);
		}
		if (programing > 91) {
			System.out.println("5 - ���������������� . " + "������� ��� - " + ((5 / 0.91) * programing / 100)
					+ " ������� % �� �������� - " + programing);
		} else if (programing > 73) {
			System.out.println("4 - ���������������� . " + "������� ��� - " + ((4 / 0.73) * programing / 100)
					+ " ������� % �� �������� - " + programing);
		} else if (programing > 60) {
			System.out.println("3 - ���������������� . " + "������� ��� - " + ((3 / 0.6) * programing / 100)
					+ " ������� % �� �������� - " + programing);
		} else if (programing < 60) {
			System.out.println("2 - ����������������  " + "������� ��� - " + ((3 / 0.6) * programing / 100)
					+ " ������� % �� �������� - " + programing);
		}

		int rent = 5000;
		int realization = 15000;
		int costPrice = 9000;
		int income = ((realization - costPrice) - rent) * 12;
		if (income > 0) {
			System.out.println("+" + income);
		} else {
			System.out.println(income);
		}
		
	}
}
