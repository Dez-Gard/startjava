package com.startjava.Lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        String answer = "yes";

        while (answer.equals("yes")) {

            System.out.print("Введите математическое выражение: ");
            String userInfo = scan.nextLine();
            String[] data = new String[3];
            data = userInfo.split("\\ ");

            double checkNum1 = Double.parseDouble(data[0]);
            double checkNum2 = Double.parseDouble(data[2]);
            if (checkNum1 < 0 || checkNum1 % 1 != 0) {
                System.out.println("Вводите целые, положительные числа!");
                continue;
            } else if(checkNum2 < 0 || checkNum2 % 1 != 0) {
                System.out.println("Вводите целые, положительные числа!");
                continue;
            }

            int var1 = Integer.parseInt(data[0]);
            calc.setVar1(var1);

            char mathOperation = data[1].charAt(0);
            calc.setMathOperation(mathOperation);

            int var2 = Integer.parseInt(data[2]);
            calc.setVar2(var2);

            calc.calculate();

            do {
                System.out.print("Желаете продолжить? [yes/no]: ");
                answer = scan.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}
