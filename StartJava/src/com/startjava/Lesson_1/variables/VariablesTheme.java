package com.startjava.Lesson_1.variables;

public class VariablesTheme {

	public static void main(String[] args) {

		int x = 100;
		int y = 200;
		double sale = 0.89;
		double i = (x + y) * sale;
		double ii = (x + y) - i;
		System.out.println(i);
		System.out.println(ii);

		System.out.println("   J    a  v     v  a    ");
		System.out.println("   J   a a  v   v  a a   ");
		System.out.println("J  J  aaaaa  V V  aaaaa  ");
		System.out.println(" JJ  a     a  V  a     a ");

		byte maxB = 127;
		short maxS = 32767;
		int maxI = 2147483647;
		long maxL = 9223372036854775807L;
		float maxF = 3.4028235E38f;
		double maxD = 1.7976931348623157E308;
		maxB++;
		maxS++;
		maxI++;
		maxL++;
		maxF++;
		maxD++;
		System.out.println(maxB);
		System.out.println(maxS);
		System.out.println(maxI);
		System.out.println(maxL);
		System.out.println(maxF);
		System.out.println(maxD);

		int a = 2;
		int b = 3;
		int z;
		z = a;
		a = b;
		b = z;
		System.out.println(a + " " + b);

		int n1 = 35;
		int n2 = 38;
		int n3 = 64;
		int n4 = 94;
		int n5 = 95;
		char c1 = (char) n1;
		char c2 = (char) n2;
		char c3 = (char) n3;
		char c4 = (char) n4;
		char c5 = (char) n5;
		System.out.println(c1 + " " + c2 + " " + c3 + " " + c4 + " " + c5);

		int sum = 3 + 4 + 5;
		int mul = 3 * 4 * 5;
		System.out.println(sum + " " + mul);

		int t1 = 47; // "/"
		int t2 = 92; // "\"
		int t3 = 95; // "_"
		int t4 = 40; // "("
		int t5 = 41; // ")"
		char ch1 = (char) t1;
		char ch2 = (char) t2;
		char ch3 = (char) t3;
		char ch4 = (char) t4;
		char ch5 = (char) t5;
		System.out.println("    " + ch1 + "" + ch2 + "    ");
		System.out.println("   " + ch1 + "  " + ch2 + "   ");
		System.out.println("  " + ch1 + "" + ch3 + "" + ch4 + " " + ch5 + "" + ch2 + "  ");
		System.out.println(" " + ch1 + "      " + ch2 + " ");
		System.out.println(ch1 + "" + ch3 + "" + ch3 + "" + ch3 + "" + ch3 + "" + ch1 + "" + ch2 + "" + "" + ch3 + ""
				+ ch3 + "" + ch2);

		int n = 123;
		int hund = n / 100 * 100;
		int ten = n % 100;
		int unit = n % 120;
		System.out.println(hund + " " + ten + " " + unit);

		int seconds = 86399;
		long sec = seconds % 60;
		long minutes = seconds % 3600 / 60;
		long hours = seconds % 86400 / 3600;
		System.out.println(hours + ":" + minutes + ":" + sec);

	}

}
