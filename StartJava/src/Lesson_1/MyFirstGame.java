package Lesson_1;

public class MyFirstGame {

	public static void main(String[] args) {

		int randomNumber = 67;

		for (int niceTry = 100; niceTry <= 100; niceTry--) {
			if (niceTry > randomNumber) {
				System.out.println(niceTry + " ������ ����� ������ ����, ��� ������� ���������");
			} else if (niceTry < randomNumber) {
				System.out.println(niceTry + " ������ ����� ������ ����, ��� ������� ���������");
			} else if (niceTry == randomNumber) {
				System.out.println("����������, ����� �������! - " + niceTry);
				break;
			}
		}
	}
}
