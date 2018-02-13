abstract class Human {
	int age = 24;
	String name = "Arabinda";

	abstract void teach();

	abstract void treat();

	abstract void business();

	void eating() {
		System.out.println("I am taking lunch");
	}

	void sleeping() {
		System.out.println("I sleep 8 hour per day");
	}
}

class Teacher extends Human {
	void teach() {
		System.out.println("she trains java to us");
	}

	void business() {
	}

	void treat() {
	}
}

class Doctor extends Human {
	void teach() {
	}

	void treat() {
		System.out.println("He treats my parent");
	}

	void business() {
	}
}

class Business extends Human {
	void teach() {
	}

	void treat() {
	}

	void business() {
		System.out.println("he is doing cloth business");
	}
}

public class Check {
	public static void main(String[] args) {
		Teacher te = new Teacher();
		te.teach();
		te.business();
		Business be = new Business();
		be.business();
	}
}