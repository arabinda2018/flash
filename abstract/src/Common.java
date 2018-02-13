class Myclass
{
	//static void calculate(double x, int y,int z )
	 void calculate(double x, int y,int z )
	{
		System.out.println("square value of of your entered number is  =  "+(x*x*y));
		System.out.println("cube  value of of your entered number is  =  "+(x*x*x));
		System.out.println("forth  value of of your entered number is  =  "+(x*x*x*x));
	}
}
public class Common 
{
	public static void main(String[] args) {
		/*Myclass.calculate(10, 20, 20);//  if method is static..
		Myclass.calculate(1, 2, 3);*/
	Myclass obj1 = new Myclass();//if method is non static 
	Myclass obj2 = new Myclass();
	Myclass obj3 = new Myclass();
	
	obj1.calculate(3,4,7);
	obj2.calculate(4,4,0);
	obj3.calculate(5,4,0);
	}
}
