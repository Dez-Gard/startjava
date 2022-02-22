package Lesson_1;

public class CycleTheme {

	public static void main(String[] args) {

		int i;
		for (i = 0; i <= 20; i++) {
			System.out.println(i);
		}

		int a = 6;
		while (a >= -6) {
			System.out.println(a);
			a -= 2;
		}

		int x = 10;
		int result = 0;
		do {
			if (x % 2 == 1) {
				result = result + x;
				}
			x++;
			} while (x < 20);

		System.out.println(result);
		
	}
}
