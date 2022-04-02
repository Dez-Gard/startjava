package Lesson_2;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Calculator calc = new Calculator();
		String answer = "yes";

		while (answer.equals("yes")) {
			System.out.print("¬ведите первое число: ");
			int var1 = scan.nextInt();
			calc.setVar1(var1);

			System.out.print("¬ведите знак математической операции: ");
			char mathOperation = scan.next().charAt(0);
			calc.setMathOperation(mathOperation);

			System.out.print("¬ведите второе число: ");
			int var2 = scan.nextInt();
			calc.setVar2(var2);

			calc.calculate();

			do {
				System.out.print("’отите продолжить вычислени€? [yes/no]: ");
				answer = scan.next();
			} while (!answer.equals("yes") && !answer.equals("no"));
		}
	}
}
