
public class Remote 
{
	String name ="sony";
	String color ="black";
	double cost =50.0;
	void switchon()
	{
		System.out.println("Please switch on the remote");
		System.out.println("Please switch on the remote");
		System.out.println("Please switch on the remote");
		System.out.println("Please switch on the remote");
	}
	void switchoff()
	{
		System.out.println("After use switch of the remote");
	}
	public static void main(String[] args) 
	{
		Remote r =new Remote();
		System.out.println("Remote nam is "+r.name);
		System.out.println("Remote color is "+r.color);
		System.out.println("Remote cost is "+r.cost);
		r.switchon();
		r.switchoff();
		}
}
