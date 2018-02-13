public interface Drive {
	public abstract void drive();
}

interface enginer {
	void engine();
}

class Maruti12 implements Drive, enginer {
	public void drive() {
		System.out.println("MARUTI CAR DRIVING");
	}

	public void engine() {
		System.out.println("");
	}
}

class BMW implements Drive {
	public void drive() {
		System.out.println("BMW IS DRIVING");
	}
}
