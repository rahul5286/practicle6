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
		System.out.println("child Class");
	}
}

class C extends A
{
	
	void dis()
	{
		System.out.println("C Child Class");
	}
}

class dispatch
{
	public static void main(String arg[])
	{
		A obj =new A();
		obj.dis();
			
		obj=new B();
		obj.dis();
		
		obj=new C();
		obj.dis();
	}
}