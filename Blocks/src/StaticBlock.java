public class StaticBlock {
	static {
		System.out.println("hello");
	}
	// static
	{
		System.out.println("hi");
	}
	// static
	{
		System.out.println("bye");
	}

	public static void main(String[] args) {
		System.out.println("hi");
	}
}
