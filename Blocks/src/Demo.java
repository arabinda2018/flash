public class Demo {
	void m1() {
		System.out.println("m1 method");
	}

	static void m2() {
		System.out.println("m2");
	}

	void m3() {
		System.out.println("m3");
	}

	void m4() {
		System.out.println("m4");
	}

	static void m5() {
		System.out.println("m5");
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.m1();
		// d.m2();
		Demo.m2();
		d.m3();

		d.m4();
		Demo.m5();
	}
}