class Laptop
{
	String name="compaq";
	String color="black";
	double cost =32000.0;
	void open()
	{
		System.out.println("To open laptop Enter ur user name");
	}
	void  close()
	{
		System.out.println("Shut down your system to close");
	}
public static void main(String[] args) 
{
	Laptop la =new Laptop();
	System.out.println("laptop name is "+la.name);
	System.out.println("laptop color is "+la.color);
	System.out.println("cost of the laptop is "+la.cost);
	la.open();
	la.close();
}
}
