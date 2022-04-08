package com.startjava.Lesson_1.calculator;

public class Calculator {

	public static void main(String[] args) {

		int var1 = 5;
		int var2 = 3;
		char mathOperation = '^';

		if (mathOperation == '+') {
			System.out.println(var1 + var2);
		} else if (mathOperation == '-') {
			System.out.println(var1 - var2);
		} else if (mathOperation == '*') {
			System.out.println(var1 * var2);
		} else if (mathOperation == '/') {
			System.out.println(var1 / var2);
		} else if (mathOperation == '^') {
			int result = 1;
			for (int i = 0; i < var2; i++) {
				result = result * var1;
			}
			System.out.println(result);
		} else if (mathOperation == '%') {
			System.out.println(var1 % var2);
		}
	}
}
