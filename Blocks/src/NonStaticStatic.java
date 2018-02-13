class test456{
	static void m1()
	{
		System.out.println("static method");
	}
	void m2()
	{
		test456.m1();
		System.out.println("m2 method");
	}
}
public class NonStaticStatic {
	public static void main(String[] args) 
	{
		test456 t=new test456();
		t.m2();
	}}
