package Lesson_1;

public class Calculator {

	public static void main(String[] args) {

		int var1 = 5;
		int var2 = 2;
		
		int sum = var1 + var2;
		int subtraction = var1 - var2;
		int multiplication = var1 * var2;
		int devision = var1 / var2;
		int degree3 = var1 * var1;
		int exponentiation1 = var1 * degree3;
		int remainderOfTheDivision = var1 % var2;
		
		int mathExpression = var1 % var2;
		
		if (mathExpression == sum) {
			System.out.println("����� ����� " + sum);

		} else if (mathExpression == subtraction) {
			System.out.println("��������� ����� " + subtraction);

		} else if (mathExpression == multiplication) {
			System.out.println("��������� ����� " + multiplication);

		} else if (mathExpression == devision) {
			System.out.println("������� ����� " + devision);

		} else if (mathExpression == exponentiation1) {
			System.out.println("���������� � ������� ����� " + exponentiation1);

		} else if (mathExpression == remainderOfTheDivision) {
			System.out.println("������� �� ������� " + remainderOfTheDivision);
		}
	}
}
