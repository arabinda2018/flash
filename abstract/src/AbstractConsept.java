class Pen {
	public void write() {
		System.out.println("i am a Pen");
	}
}

class Pencil {
	public void write() {
		System.out.println("I am a pencil");
	}
}

class Kit {
	public void doSomething(Pen p) {
		p.write();
	}

	public void doSomething(Pencil pc) {
		pc.write();

	}
}

public class AbstractConsept {

	public static void main(String[] args) {
		Kit k = new Kit();
		Pen p = new Pen();
		Pencil pc = new Pencil();
		k.doSomething(p);
		k.doSomething(pc);

	}

}
