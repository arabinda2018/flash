
public class Recursion2 {
	static void m1(int i) {
		if (i <= 10) {
			System.out.println(i);
			i++;
			m1(i);
		}
	}

	public static void main(String[] args) {
		m1(1);
	}
}
