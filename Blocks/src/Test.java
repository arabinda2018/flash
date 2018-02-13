class Appl1 {
	void login() {
		System.out.println("Password should consist of 4 character");
	}

	void reg() {
		System.out.println("ragistration");
	}
}

class Appl2 extends Appl1 {
	void login() {
		System.out.println("Password should consist of 6 character");
	}
}

public class Test {
	public static void main(String[] args) {
		Appl2 a = new Appl2();
		a.login();
		a.reg();
	}
}
