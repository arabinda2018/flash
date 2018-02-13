interface Automobile {
	void fuelType();

	void no_of_wheels();
}

interface TwoWheeler extends Automobile {
	void ignition();
}

interface FourWheeler extends Automobile {
	void powerStearing();
}

class Byke implements TwoWheeler {

	@Override
	public void fuelType() {
		// TODO Auto-generated method stub

	}

	@Override
	public void no_of_wheels() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ignition() {
		// TODO Auto-generated method stub

	}

}

class Swift implements Automobile, FourWheeler {

	@Override
	public void powerStearing() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fuelType() {
		// TODO Auto-generated method stub

	}

	@Override
	public void no_of_wheels() {
		// TODO Auto-generated method stub

	}

}

class Maruti implements Automobile, FourWheeler

{

	@Override
	public void powerStearing() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fuelType() {
		// TODO Auto-generated method stub

	}

	@Override
	public void no_of_wheels() {
		// TODO Auto-generated method stub

	}

}

class Display {
	void show(TwoWheeler t) {
		t.no_of_wheels();
		t.fuelType();
		t.ignition();
	}

	void show1(FourWheeler f) {
		f.fuelType();
		f.no_of_wheels();
		f.powerStearing();
	}
}

public class Sample {
	public static void main(String[] args) {
		Display d = new Display();
		d.show(new Byke());
		d.show1(new Swift());
	}
}