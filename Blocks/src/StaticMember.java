class StDetails {
	String name;
	double id;
	static String collegename = "GIST";
	static String center = "ambapua";

	StDetails(String n, double i) {
		name = n;
		id = i;
	}

	void displayDetail() {
		System.out.println("name is" + name);
		System.out.println("id is " + id);
		System.out.println("college name is " + collegename);
		System.out.println("center is" + center);
	}
}

public class StaticMember {
	public static void main(String[] args) {
		StDetails s1 = new StDetails("arabinda", 1.2f);
		StDetails s2 = new StDetails("arpita", 2);
		StDetails s3 = new StDetails("sushma", 3);
		s1.displayDetail();
		s2.displayDetail();
		s3.displayDetail();
	}
}