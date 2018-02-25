class Student
{
	String name="Arabinda";
	int age;
	int rollno;
	void read()
	{
		System.out.println("He is reading Data structure");
	}
	void dance()
	{
		System.out.println("Some times he is dancing alone");
	}
		
}
class Teacher 
{
	double salary;
	int  empid;
	String name;
	void teach()
	{
	System.out.println("He teache=s UNIX");	
	}
	void writing()
	{
		System.out.println("he writes on the black board");
	}
}
class Sample7
{
	public static void main(String[] args) 
	{
		Student st =new Student();
		st.name="Arabinda";
		st.age=24;
		st.rollno=6;
		System.out.println("student nam is "+st.name);
		System.out.println("student age is "+st.age);
		System.out.println("student rollno is "+st.rollno);
		st.read();
		st.dance();
		System.out.println("\n\n***************************************");
		Teacher te =new Teacher();
		te.salary=45500;
		te.empid=4463;
		te.name="Alex";
		System.out.println("teachers salary is "+te.salary);
		System.out.println("Teachers empid is "+te.empid);
		System.out.println("Teachers name is "+te.name);
		te.teach();
		te.writing();
		
	}
}