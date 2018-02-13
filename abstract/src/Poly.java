public class Poly {
	static void dec() {
		System.out.println("hi");
	}

	void dec(int a, int b) {
		System.out.println("hello");
	}

	void dec(int a, int b, int c) {
		System.out.println("by");
	}

	public static void main(String[] args) {
		Poly p = new Poly();
		p.dec(10, 20, 30);
		p.dec(100, 200);
		// p.dec();
		Poly.dec();
	}
}
