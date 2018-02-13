//static blocks allows only static member
//Non static block allows both static and non static member.
public class StatNon {
	static int i = 10;
	static int j = 20;
	int l = 5;
	static {
		// int k =i+l;
		// System.out.println(k); //compile time error
	}
	static {
		int k = i + j;
		System.out.println(k);// working fine...
	}

	{
		int ko = i + l;
		System.out.println(ko);
	}

	public static void main(String[] args) {
		StatNon sn = new StatNon();
		// System.out.println("hello");

	}
}