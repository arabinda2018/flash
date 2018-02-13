interface ABC {
	void m1();

	void m2();
}

abstract class Test implements ABC {
	public void m1() {
		System.out.println("HI");
	}
}

class child extends Test {
	public void m2() {
		System.out.println("HELLO");
	}
}

public class Demo1 {
	public static void main(String[] args) {

		child c = new child();
		c.m1();
		c.m2();
	}
}
