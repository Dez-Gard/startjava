package Lesson_2;

public class WolfTest {

	public static void main(String[] args) {
	
		Wolf Raska = new Wolf("male", "Raska", 45, 9, "white");
		
		Raska.setAge(8);		
		Raska.setGender("female");
		Raska.setName("Raska");
		Raska.setWeight(45);	
		Raska.setColor("white");
		
		System.out.println(Raska.getAge());
		System.out.println(Raska.getGender());
		System.out.println(Raska.getName());
		System.out.println(Raska.getWeight());
		System.out.println(Raska.getColor());
		
		Raska.howl();
		Raska.hunt();
		Raska.run();
		Raska.sit();
		Raska.walk();
		
	}
}
