class NoteBook 
{
	void open()
	{
		System.out.println("Open book");
	}
	void tutnPage()
	{
		System.out.println("Trun the pages");
	}
	void close()
	{
		System.out.println("Close the notebook");
	}
}
class Pencel
	{
		void writing()
		{
			System.out.println("writing something");
		}
	}
public class Demo1
{
	public static void main(String[] args) 
	{
		NoteBook n =new NoteBook();
		Pencel p =new Pencel();
		n.open();
		p.writing();
		n.tutnPage();
		p.writing();
		n.close();
		}
}
	