class Intro {
	String name;
	int age;
	float weight;

	Intro(String name, int age, float weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	void display() {
		System.out.println("my name is " + name);
		System.out.println("my age is " + age);
		System.out.println("my weight is " + weight);
	}
}

public class ThisKeyword {
	public static void main(String[] args) {

		Intro in = new Intro("arabinda", 24, 65);
		in.display();
		Intro in2 = new Intro("rudra", 120, 69);
		in2.display();
		Intro in3 = new Intro("prakash", 62, 86);
		in3.display();
	}
}