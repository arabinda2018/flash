 class Demo97 
{
	void add(int a ,int b){
		int c =a+b;
		System.out.println("value of c is "+c);
	}
	int sub (int x ,int y){
		int z =x-y;
	System.out.println(z);
	return z;
	
	}
	public static void main(String[] args) {
		Demo97 d= new Demo97();
		d.add(20, 30);
		d.sub(120, 100);
	}
}
