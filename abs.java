abstract class Bank
{
	abstract void add();
}
class sbi extends Bank
{
	void add()
	{
		int a=10,b=20;
		int c=a+b;
		System.out.println(c);
	}
}
class abs
{
	public static void main(String arg[])
	{
		Bank b=new sbi();
		b.add();
	}
}