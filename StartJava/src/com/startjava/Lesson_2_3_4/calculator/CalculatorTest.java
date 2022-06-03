package com.startjava.Lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        String answer = "yes";

        while (answer.equals("yes")) {

            System.out.print("Введите математическое выражение: ");

            try {

                String userInfo = scan.nextLine();
                String[] data;
                data = userInfo.split(" ");

                int var1 = Integer.parseInt(data[0]);
                calc.setVar1(var1);

                char mathOperation = data[1].charAt(0);
                calc.setMathOperation(mathOperation);

                int var2 = Integer.parseInt(data[2]);
                calc.setVar2(var2);

                if (var1 < 0 || var2 < 0) {
                    System.out.println("Вводите положительные числа!");
                    continue;
                }

            } catch (NumberFormatException e) {
                System.out.println("Вводите целые числа!");
                continue;
            }

            Calculator.calculate();

            do {
                System.out.print("Желаете продолжить? [yes/no]: ");
                answer = scan.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}