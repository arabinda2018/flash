import java.util.Date;

abstract class Watch {
	void showDate() {
		Date d = new Date();
		System.out.println("Date is " + d);
	}

	abstract void showweather();
}

class Rolex extends Watch {
	void showweather() {
		System.out.println("weather is sunny");
	}
}

class SmartWatch extends Watch {
	void showweather() {
		System.out.println("Weather is rainy");
	}
}

class FastTrack extends Watch {
	void showweather() {
		System.out.println("wheater is fog");
	}
}

class Display {
	void show(Watch wa) {
		wa.showDate();
		wa.showweather();
	}
}

public class Demos {
	public static void main(String[] args) {
		Display d = new Display();
		d.show(new FastTrack());
		d.show(new Rolex());
		d.show(new SmartWatch());
	}
}
