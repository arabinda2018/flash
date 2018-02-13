class ReservationSystem {
	String passenger$name;
	double ticket_number;
	static String train_name = "prasanti express";

	void details(String n, double t) {
		passenger$name = n;
		ticket_number = t;
	}

	void status() {
		System.out.println("Passenger name is " + passenger$name);
		System.out.println("Ticket number is " + ticket_number);
		System.out.println("train name is " + train_name);
	}
}

public class Railway {
	public static void main(String[] args) {
		ReservationSystem rv = new ReservationSystem();
		rv.details("Arabinda", 10234);
		rv.status();
		rv.details("ambika", 59340);
		rv.status();
		rv.details("srikanta", 9019);
		rv.status();
		System.out.println("*********");

		rv.status();
		System.out.println("********");
		rv.status();

	}
}
