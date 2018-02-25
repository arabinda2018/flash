 class Pen1 
{
	String name ;
	String color ;
	double cost;
	void write()
	{
		int a =5;
		System.out.println("writing essay");
	System.out.println(a);
	}
	void refill()
	{
		System.out.println("refiling ink ");
		System.out.println(name);
	}
}
public class Demo
{
	public static void main(String[] args) 
	{
		Pen1 p=new Pen1();
		p.name="parker";
		p.color="black";
		p.cost=70.0;
		System.out.println("pen name is "+p.name);
		System.out.println("pen color is "+p.color);
		System.out.println("pen cost is "+p.cost);
		p.write();
		p.refill();
		Pen1 p1= new Pen1();
		p1.name="Reynolds";
		p1.color="black";
		p1.cost=60.5;
		System.out.println("Name of the pen is "+p1.name);
		System.out.println("Name of the color is "+p1.color);
		System.out.println("Cost of the penn is "+p1.cost);
		p1.write();
		p1.refill();
	}
}
