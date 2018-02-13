class test123
{
	static  void m1()
	{
		System.out.println("m1 method");
		System.out.println("Methods are to add");
		System.out.println("methods are to sub");
		System.out.println("ruels are made to be broken");
	}
	 static void a1()
	 {
		 System.out.println("i am from a1");
	 }
	 static void b1()
	 {
		 System.out.println("i am from b1 okk.");
	 }
	 static void m2()
	{
		 b1();
		m1();
		a1();
		arab();
		System.out.println("m2 method");
	}
	static void arab()
	 {
		 System.out.println("hi bro ");
		 System.out.println("Wha about you");
		 System.out.println("Whats going on with your friend..");
	 }
}
public class NonstaticMethod {
	public static void main(String[] args) {
	/*test123 t1=new test123();
	t1.m2();*/
	test123.m2();
	}
}
