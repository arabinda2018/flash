public class MethodOverload 
{
	int search(int i)
	{
		System.out.println(i);
		return i;
	}
	void search(double d, int i)
	{
		System.out.println(d +" "+i);
	}
	void search(int i ,String s)
	{
		System.out.println(i +" "+s);
	}
	void search(String s, int i)
	{
		System.out.println(s+" "+i);
	}
	void search(int x, int y)
	{
		System.out.println(x+ " "+y);
	}
	void search(int a,int b,int c)
	{
		System.out.println(a+" "+b+ " "+c);
	}
	public static void main(String[] args) 
	{
	MethodOverload d = new MethodOverload();
	d.search(10);
	d.search(20.0, 20);
	d.search("sushama", 10);
	d.search(30,"anu");
	d.search(120, 140);
	d.search(121, 122, 123);
	d.search("Arabinda", 'a');
	}
}
