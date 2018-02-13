class A {
	static int k = 10;

	static void m3() {
		System.out.println("m3");
	}
}

public class StaticVar_Method {
	static int i = 10;
	int j = 20;

	void m1() {
		System.out.println("m1");
	}

	static void m2() {
		System.out.println("m2");
	}

	public static void main(String[] args) {
		System.out.println(i);
		m2();
		System.out.println(A.k);
		A.m3();
	}
}