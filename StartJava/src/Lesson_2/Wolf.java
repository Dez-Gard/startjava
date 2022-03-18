package Lesson_2;

public class Wolf {

	private String gender = "male";
	private String name = "Balto";
	private float weight = 54.3f;
	private int age = 5;
	private String color = "gray";

	public Wolf(String gender, String name, float weight, int age, String color) {
		super();
		this.gender = gender;
		this.name = name;
		this.weight = weight;
		this.age = age;
		this.color = color;
	}

	public void walk() {
		System.out.println("Гуляет");
	}
	
	public void sit() {
		System.out.println("Сидит");
	}
	
	public void run() {
		System.out.println("Бежит");
	}
	
	public void howl() {
		System.out.println("Воет");
	}
	
	public void hunt() {
		System.out.println("Охотится");
	}
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("Некорректный возраст");
		} else {
		this.age = age;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
