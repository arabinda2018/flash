class A1 {
	int i = 10;

	void show() {
		System.out.println("hi");
	}
}

class B extends A1 {
	int i = 20;

	void show() {
		System.out.println("hello");
	}
}

public class MethodOverRidden {
	public static void main(String[] args) {
		B b = new B();
		A1 a = new A1();
		System.out.println(b.i);
		b.show();
	}
}