public class StaticBlocksDemo {
	static {
		checkport();
		checkservice();
		checklicense();
			}
public static void main(String[] args) {
		StaticBlocksDemo d = new StaticBlocksDemo();
		System.out.println("My sql lunch");
	}

	static void checkport() {
		System.out.println("check port");
	}

	static void checkservice() {
		System.out.println("Check service is on");
	}

	static void checklicense() {
		System.out.println("license issued");
	}
}
