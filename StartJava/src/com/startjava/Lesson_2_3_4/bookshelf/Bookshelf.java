package com.startjava.Lesson_2_3_4.bookshelf;

import java.util.Scanner;

public class Bookshelf {

    static Scanner scanner = new Scanner(System.in);
    private static final String[] bookshelf = new String[10];
    private static int booksOnShelf = 0;
    private static int freeSpace = 0;

    public static void addBook() {
        System.out.println("Введите через \",\" «Автор, название книги, год издания»:");
        for (int i = 0; i < bookshelf.length; i++) {
            if (bookshelf[i] == null) {
                bookshelf[i] = scanner.nextLine();
                break;
            }
            if (i == bookshelf.length - 1) {
                System.out.println("Нет свободного места!");
            }
        }
    }

    public static void removeBook() {
        System.out.println("Введите название книги которую хотите удалить:");
        String search = scanner.nextLine();
        for (int i = 0; i < bookshelf.length; i++) {
            if (bookshelf[i] != null) {
                if (bookshelf[i].contains(search)) {
                    bookshelf[i] = null;
                    System.arraycopy(bookshelf, i + 1, bookshelf, i, bookshelf.length - (i + 1));
                    break;
                }
            }
            if (i == bookshelf.length - 1) {
                System.out.println("Книга не найдена!");
            }
        }
    }

    public static void searchBook() {
        System.out.println("Введите название книги:");
        String search = scanner.nextLine();
        for (int i = 0; i < bookshelf.length; i++) {
            if (bookshelf[i] != null) {
                if (bookshelf[i].contains(search)) {
                    System.out.println("Вот, ваша книга: " + (i + 1) + ". " + bookshelf[i]);
                    break;
                }
            }
            if (i == bookshelf.length - 1) {
                System.out.println("Книга не найдена!");
            }
        }
    }

    public static void showBookOnShelf() {
        for (String s : bookshelf) {
            if (s != null) {
                booksOnShelf++;
            }
        }
        System.out.println("Количество книг на полке: " + booksOnShelf);
    }

    public static void showFreeSpace() {
        for (String s : bookshelf) {
            if (s == null) {
                freeSpace++;
            }
        }
        System.out.println("Количество свободного места : " + freeSpace);
    }

    public static void showArray() {
        System.out.println();
        System.out.println("Актуальный список книг:");
        for (int i = 0; i < bookshelf.length; i++) {
            if (bookshelf[i] == null) {
                System.out.println("<                       >");
            } else {
                System.out.println("<" + (i + 1) + ". " + bookshelf[i] + ">");
            }
        }
    }
}