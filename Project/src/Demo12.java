class Ticket
{
	int no_oftickets =20;
	void availbility()
	{
		System.out.println("availbility tickets are"+no_oftickets);
	}
	void book(int n)
	{
		if (no_oftickets>=n)
		{
			no_oftickets=no_oftickets-n;
			System.out.println("user booked"+n+"tickets");
			System.out.println("availbility tickets are"+no_oftickets);
		}
		else
		{
			System.out.println("Tickets are not available");
		}
	}
void cancel(int m)
{
	no_oftickets =no_oftickets+m;
	System.out.println("user canceled"+m+"tickets");
	System.out.println("availbility tickets are"+no_oftickets);
}
}
public class Demo12
{
	public static void main(String[] args) 
	{
		Ticket t =new Ticket();
		t.availbility();
		t.book(10);
		t.cancel(5);
	}
}

