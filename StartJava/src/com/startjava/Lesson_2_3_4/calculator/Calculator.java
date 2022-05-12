package com.startjava.Lesson_2_3_4.calculator;

public class Calculator {

	private static int var1;
	private static int var2;
	private static char mathOperation;

	public void setVar1(int var1) {
		Calculator.var1 = var1;
	}

	public void setVar2(int var2) {
		Calculator.var2 = var2;
	}

	public void setMathOperation(char mathOperation) {
		Calculator.mathOperation = mathOperation;
	}

	public static void calculate() {
		switch (mathOperation) {
			case '+':
				System.out.println("Результат сложения: " + (Math.addExact(var1, var2)));
				break;
			case '-':
				System.out.println("Результат вычитания: " + (Math.subtractExact(var1, var2)));
				break;
			case '*':
				System.out.println("Результат умножения: " + (Math.multiplyExact(var1, var2)));
				break;
			case '/':
				System.out.println("Результат деления: " + (Math.floorDiv(var1, var2)));
				break;
			case '^':
				System.out.println("Результат возведения в степень: " + (Math.pow(var1, var2)));
				break;
			case '%':
				System.out.println("Результат остатка от деления: " + (Math.IEEEremainder(var1, var2)));
				break;
			default:
				System.out.println("Error");
				break;
		}
	}
}