import java.util.*;


class p2
{
	int a=10,b=20;
	void dish()
	{
		System.out.println("The value of A is "+a);
	}
}
class obj
{
	
	
	public static void main(String arg[])
	{
		
		p2 obj=new p2();
		obj.dish();
		System.out.println("The value of B is "+obj.b);
		
	}
}