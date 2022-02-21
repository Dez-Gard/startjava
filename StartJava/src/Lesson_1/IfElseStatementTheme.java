package Lesson_1;

public class IfElseStatementTheme {

	public static void main(String[] args) {

		int age = 19;
		boolean male = false;
		double height = 1.80;
		char firstLetterOfTheName;
		if (age > 20) {
			System.out.println("Я взрослый!");
		} else {
			System.out.println("Вот когда подросту...");
		}
		if (!male) {
			System.out.println("Я не мужик!?");
		}
		if (height < 1.80) {
			System.out.println("Я высокий.");
		} else {
			System.out.println("Я низкий.");
		}
		firstLetterOfTheName = "Igor".charAt(0);
		if (firstLetterOfTheName == 'M') {
			System.out.println("Ты наверное Михаил.");
		} else if (firstLetterOfTheName == 'I') {
			System.out.println("Ты наверное Игорь.");
		} else {
			System.out.println("Я сдаюсь.");
		}

		int num1 = 796;
		int num2 = 81;
		if (num1 > num2) {
			System.out.println("Максимальное число " + num1);
			System.out.println("Минимальное число " + num2);
		} else if (num2 > num1) {
			System.out.println("Максимальное число " + num2);
			System.out.println("Минимальное число " + num1);
		}

		int i1 = 33;
		if (i1 % 2 == 0) {
			System.out.println("Ваше число четное");
		} else {
			System.out.println("Ваше число не четное");
		}
		if (i1 > 0) {
			System.out.println("Ваше число положительное");
		} else if (i1 == 0) {
			System.out.println("Ваше число 0");
		} else {
			System.out.println("Ваше число отрицательное");
		}

		String one = "345";
		String two = "543";
		if (one.charAt(1) == two.charAt(1)) {
			System.out.println("Это одинаковое число - " + one.charAt(1));
		} else {
			System.out.println("Совпадений не найдено");
		}

		char oct = '\u005A';
		int ascii = (int) oct;
		System.out.println("В десятичной с.с. будет " + ascii);
		System.out.println("Знак ASCII будет " + oct);

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
			System.out.println("5 - История. " + "Средний бал - " + ((5 / 0.91) * history / 100)
					+ " Средний % по предмету - " + history);
		} else if (history > 73) {
			System.out.println("4 - История. " + "Средний бал - " + ((4 / 0.73) * history / 100)
					+ " Средний % по предмету - " + history);
		} else if (history > 60) {
			System.out.println("3 - История. " + "Средний бал - " + ((3 / 0.6) * history / 100)
					+ " Средний % по предмету - " + history);
		} else if (history < 60) {
			System.out.println("2 - История " + "Средний бал - " + ((3 / 0.6) * history / 100)
					+ " Средний % по предмету - " + history);
		}
		if (programing > 91) {
			System.out.println("5 - Программирование . " + "Средний бал - " + ((5 / 0.91) * programing / 100)
					+ " Средний % по предмету - " + programing);
		} else if (programing > 73) {
			System.out.println("4 - Программирование . " + "Средний бал - " + ((4 / 0.73) * programing / 100)
					+ " Средний % по предмету - " + programing);
		} else if (programing > 60) {
			System.out.println("3 - Программирование . " + "Средний бал - " + ((3 / 0.6) * programing / 100)
					+ " Средний % по предмету - " + programing);
		} else if (programing < 60) {
			System.out.println("2 - Программирование  " + "Средний бал - " + ((3 / 0.6) * programing / 100)
					+ " Средний % по предмету - " + programing);
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
