import java.util.*;

class object
{
	int id;
	String name;
}
class Testobject
{
	public static void main(String args[])
	{
		object o1=new object();
		o1.id=10;
		o1.name="Darshan";
		System.out.println(o1.id+" "+o1.name);
	}
}