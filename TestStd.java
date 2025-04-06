import java.util.*;

class student
{
	int rno;
	String name;
	void insert (int r,String n)
	{
		rno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rno+" "+name);
	}
}
class TestStd
{
	public static void main(String arg[])
	{
		student s1=new student();
		student s2=new student();
		
		s1.insert(11,"Darshan");
		s2.insert(22,"Kartik");

		s1.display();
		s2.display();
	}
}