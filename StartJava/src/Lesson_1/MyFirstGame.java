package Lesson_1;

public class MyFirstGame {

	public static void main(String[] args) {

		int diapason = 100;
		int randomNumber = (int) (Math.random() * diapason);

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
