class Student3 {
	String name;
	String collegename;
	int id;

	Student3(String n, int i, String c) {
		name = n;
		id = i;
		collegename = c;
	}

	void display() {
		System.out.println("name is" + name);
		System.out.println("id is " + id);
		System.out.println("college name is" + collegename);
	}
}

public class ParConstructor {
	public static void main(String[] args) {
		Student3 s1 = new Student3("arabinda", 12, "nist");
		s1.display();
		Student3 s2 = new Student3("ram", 23, "gist");
		s2.display();
		Student3 s3 = new Student3("madhab", 34, "bam");
		s3.display();
	}
}