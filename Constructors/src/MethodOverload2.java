public class MethodOverload2 
{
	MethodOverload2(int i)
	{
		System.out.println(i);
	}
	MethodOverload2(int i,int j)
	{
		System.out.println(i+" "+j);
	}
	MethodOverload2(double d,String s)
	{
		System.out.println(d+" "+s);
	}
	MethodOverload2(String s,double d)
	{
		System.out.println(s+ " "+d);
	}
	public static void main(String[] args) {
		MethodOverload2 d0 =new MethodOverload2(5);
		MethodOverload2 d1 =new MethodOverload2(10,20);
		MethodOverload2 d2 =new MethodOverload2(20.0,"abc");
		MethodOverload2 d3 =new MethodOverload2("xyz",20.0);
		MethodOverload2 d4 =new MethodOverload2("kalia",23.5);
		}
}
