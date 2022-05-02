package com.startjava.Lesson_2_3_4.calculator;

public class Calculator {

	private int var1;
	private int var2;
	private char mathOperation;

	public void setVar1(int var1) {
		this.var1 = var1;
	}

	public void setVar2(int var2) {
		this.var2 = var2;
	}

	public void setMathOperation(char mathOperation) {
		this.mathOperation = mathOperation;
	}

	public void calculate() {
		switch (mathOperation) {
		case '+':
			System.out.println("Результат сложения: " + (var1 + var2));
			break;
		case '-':
			System.out.println("Результат вычитания: " + (var1 - var2));
			break;
		case '*':
			System.out.println("Результат умножения: " + (var1 * var2));
			break;
		case '/':
			System.out.println("Результат деления: " + (var1 / var2));
			break;
		case '^':
			pow();
			break;
		case '%':
			System.out.println("Результат остатка от деления: " + (var1 % var2));
			break;
		default :
			System.out.println("Error");
		}
	}

	private void pow() {
		int result = 1;
		for (int i = 0; i < var2; i++) {
			result = result * var1;
		}
		System.out.println("Результат возведения в степень: " + result);
	}
}