class _Sample {
	void m1() {
		System.out.println("hi good evening ");
	}

	static void m2() {
		new _Sample().m1();
		System.out.println("hi good morning ");
	}
}

public class StaticCallNonstatic {
	public static void main(String[] args) {
		_Sample s = new _Sample();
		s.m2();
	}
}
