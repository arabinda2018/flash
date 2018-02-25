import java.util.Scanner;

public class Name {
public static void main(String[] args) {
	//String pwd="kalia@13";
	String name ="sonyy";
	String color= "black";
	double cost=50.0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your password");
	String pwd=sc.nextLine();
	
	if(pwd =="kalia@123")
	{
	System.out.println(name);
	System.out.println(color);
	System.out.println(cost);
	}
	else
		System.out.println("invalid user");
}
}
