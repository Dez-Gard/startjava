package com.startjava.Lesson_2_3_4.bookshelf;

import java.util.Scanner;

public class BookshelfMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Приветствую на «Книжной полке»!");
        String menu = "< Напишите команду: >\n" +
                "1. Добавить книгу\n" +
                "2. Удалить книгу\n" +
                "3. Найти книгу\n" +
                "4. Занятое место\n" +
                "5. Свободное место\n";

        while (true) {
            System.out.println();
            System.out.println(menu);
            switch (scanner.nextLine()) {
                case "Добавить книгу":
                    Bookshelf.addBook();
                    Bookshelf.showArray();
                    break;
                case "Удалить книгу":
                    Bookshelf.removeBook();
                    Bookshelf.showArray();
                    break;
                case "Найти книгу":
                    Bookshelf.searchBook();
                    System.out.println();
                    Bookshelf.showArray();
                    break;
                case "Занятое место":
                    Bookshelf.showBookOnShelf();
                    Bookshelf.showArray();
                    break;
                case "Свободное место":
                    Bookshelf.showFreeSpace();
                    Bookshelf.showArray();
                    break;
                default:
                    System.out.println("Ошбика ввода!");
                    System.out.println();
            }
        }
    }
}
