package Lesson_2;

public class WolfTest {

	public static void main(String[] args) {
	
		Wolf Raska = new Wolf("female", "Raska", 45, 4, "white");
		
		System.out.println(Raska.gender);
		System.out.println(Raska.name);
		System.out.println(Raska.weight);
		System.out.println(Raska.age);
		System.out.println(Raska.color);
		
		Raska.howl();
		Raska.hunt();
		Raska.run();
		Raska.sit();
		Raska.walk();
		
	}
}
