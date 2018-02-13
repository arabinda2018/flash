class Samp91 {
	static void read() {
		System.out.println("readning");
	}

	static int i = 35;

	static void write() {
		System.out.println("writing");
	}
}

class samp92 {
	void act() {
		System.out.println("action");
	}

	void dance() {
		System.out.println("dancer");
	}
}

public class Samp {
	public static void main(String[] args) {

		samp92 s2 = new samp92();
		s2.act();
		s2.dance();
		Samp91.read();
		Samp91.write();
		int res = Samp91.i;
		System.out.println(res);
	}
}