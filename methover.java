class A
{
	void dis()
	{
		System.out.println("Parent Class");
	}
}

class B extends A
{
	
	void dis()
	{
		super.dis();
		System.out.println("child Class");
	}
}

class methover
{
	public static void main(String arg[])
	{
		B obj =new B();
		obj.dis();
		
	}
}