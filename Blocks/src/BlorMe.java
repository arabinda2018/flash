class Blormee {
	// System.out.println( age>50 ?"you are old ":"you are young");
	void demo() {
		System.out.println("hi");
	}

	public void demo1() {
		System.out.println("hello");
	}

	private void demo2() {
		System.out.println("hi hello");
	}

	protected void demo3() {
		System.out.println("hi hello hi");
	}
}

public class BlorMe extends Blormee {
	public static void main(String[] args) {
		Blormee bl = new Blormee();
		bl.demo();
		bl.demo1();
		bl.demo3();
		// b1.demo2();
	}
}