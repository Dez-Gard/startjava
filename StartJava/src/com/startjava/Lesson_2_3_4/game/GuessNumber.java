package com.startjava.Lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private final Player pl1;
    private final Player pl2;
    private final Player pl3;
    private int myNum;
    private int compNum;

    public GuessNumber(Player pl1, Player pl2, Player pl3) {
        this.pl1 = pl1;
        this.pl2 = pl2;
        this.pl3 = pl3;
    }

    public void start() {
        Random rnd = new Random();
        compNum = rnd.nextInt(100 + 1);
        Scanner scan = new Scanner(System.in);

        int i = 1;
        while (i < 6) {
            System.out.print(pl1.getName() + ", введите число: ");
            myNum = scan.nextInt();
            checkRange();
            pl1.inputNumPlr1[i - 1] = myNum;

            if (myNum == compNum) {
                System.out.println("Игрок - " + pl1.getName() + " угадал число - " + compNum + " c " + i + " попытки!");
                break;
            } else if (myNum == 0) {
                System.out.println("Ваша попытка не засчитывается.");
            } else if (myNum > compNum) {
                System.out.println(myNum + " - БОЛЬШЕ загаданного");
            } else {
                System.out.println(myNum + " - МЕНЬШЕ загаданного");
            }
            System.out.println();
            if (i == 5) {
                System.out.println("У " + pl1.getName() + " закончились попытки!");
                System.out.println();
            }

            System.out.print(pl2.getName() + ", введите число: ");
            myNum = scan.nextInt();
            checkRange();
            pl2.inputNumPlr2[i - 1] = myNum;

            if (myNum == compNum) {
                System.out.println("Игрок - " + pl2.getName() + " угадал число - " + compNum + " c " + i + " попытки!");
                break;
            } else if (myNum == 0) {
                System.out.println("Ваша попытка не засчитывается.");
            } else if (myNum > compNum) {
                System.out.println(myNum + " - БОЛЬШЕ загаданного");
            } else {
                System.out.println(myNum + " - МЕНЬШЕ загаданного");
            }
            System.out.println();
            if (i == 5) {
                System.out.println("У " + pl2.getName() + " закончились попытки!");
                System.out.println();
            }

            System.out.print(pl3.getName() + ", введите число: ");
            myNum = scan.nextInt();
            checkRange();
            pl3.inputNumPl3[i - 1] = myNum;

            if (myNum == compNum) {
                System.out.println("Игрок - " + pl3.getName() + " угадал число - " + compNum + " c " + i + " попытки!");
                break;
            } else if (myNum == 0) {
                System.out.println("Ваша попытка не засчитывается.");
            } else if (myNum > compNum) {
                System.out.println(myNum + " - БОЛЬШЕ загаданного");
            } else {
                System.out.println(myNum + " - МЕНЬШЕ загаданного");
            }
            System.out.println();
            if (i == 5) {
                System.out.println("У " + pl3.getName() + " закончились попытки!");
                System.out.println();
            }
            i++;
        }

        int[] copyNumPl1 = Arrays.copyOf(pl1.inputNumPlr1, i);
        int[] copyNumPl2 = Arrays.copyOf(pl2.inputNumPlr2, i);
        int[] copyNumPL3 = Arrays.copyOf(pl3.inputNumPl3, i);
        Arrays.fill(pl1.inputNumPlr1, 0);
        Arrays.fill(pl2.inputNumPlr2, 0);
        Arrays.fill(pl3.inputNumPl3, 0);
        System.out.println();

        System.out.println("Названные числа игроком " + pl1.getName() + ":");
        for (int k : copyNumPl1) {
            if (k == 0) {
                continue;
            }
            System.out.print(k + " ");
        }
        System.out.println();

        System.out.println("Названные числа игроком " + pl2.getName() + ":");
        for (int k : copyNumPl2) {
            if (k == 0) {
                continue;
            }
            System.out.print(k + " ");
        }
        System.out.println();

        System.out.println("Названные числа игроком " + pl3.getName() + ":");
        for (int k : copyNumPL3) {
            if (k == 0) {
                continue;
            }
            System.out.print(k + " ");
        }
        System.out.println();
    }

    private void checkRange() {
        if (myNum < 0 || myNum > 100) {
            System.out.println("Вводите числа в диапазоне: 1 - 100");
            myNum = 0;
        }
    }
}
