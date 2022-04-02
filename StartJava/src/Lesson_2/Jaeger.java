package Lesson_2;

public class Jaeger {
		
	private String modelName;
	private String mark;
	private String orgin;
	private float height;
	private float weight;
	private int speed;
	private int strenght;
	private int armor;

	public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strenght, int armor) {
		this.modelName = modelName;
		this.mark = mark;
		this.orgin = origin;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strenght = strenght;
		this.armor = armor;
	}

	@Override
	public String toString() {
		return "Jaeger [modelName=" + modelName + ", mark=" + mark + ", orgin=" + orgin + ", height=" + height
				+ ", weight=" + weight + ", speed=" + speed + ", strenght=" + strenght + ", armor=" + armor + "]";
	}
}
