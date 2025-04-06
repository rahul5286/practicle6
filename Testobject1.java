import java.util.*;

class object
{
	int id;
	String name;
}
class Testobject1
{
	public static void main(String args[])
	{
		object o1=new object();
		object o2=new object();
		o1.id=10;
		o1.name="Darshan";
		
		o2.id=20;
		o2.name="Kartik";
		System.out.println(o1.id+" "+o1.name);
		System.out.println(o2.id+" "+o2.name);
	}
}