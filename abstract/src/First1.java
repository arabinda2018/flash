class First {
	void des() {
		System.out.println("This is first class");
	}

}

class Second extends First {
	void des() {
		System.out.println("This is second class");
	}

}

class Third extends Second {
	/*void des() {
		System.out.println("This is third class");
	}*/

}

public class First1 {
	public static void main(String[] args) {
		Third f = new Third();
		f.des();
	}
}
