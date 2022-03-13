package Lesson_2;

public class Wolf {

	String gender = "male";
	String name = "Balto";
	float weight = 54.3f;
	int age = 5;
	String color = "gray";
	
	
	public Wolf(String gender, String name, float weight, int age, String color) {
		super();
		this.gender = gender;
		this.name = name;
		this.weight = weight;
		this.age = age;
		this.color = color;
	}

	void walk() {
		System.out.println("Гуляет");
	}
	
	void sit() {
		System.out.println("Сидит");
	}
	
	void run() {
		System.out.println("Бежит");
	}
	
	void howl() {
		System.out.println("Воет");
	}
	
	void hunt() {
		System.out.println("Охотится");
	}
}
