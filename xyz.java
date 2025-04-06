import java.util.*;

 class xyz
{
	public static void main(String arg[])
	{
		int Rno;
		String str;
		String city;
		double phone;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Roll No : ");
		Rno=sc.nextInt();
		System.out.println("Enter Roll No : "+Rno);
		
		sc.nextLine();
		System.out.println("Enter Name : ");
		str=sc.nextLine();
		System.out.println("Enter Name : "+str);
		
		sc.nextLine();
		System.out.println("Enter City : ");
		city=sc.nextLine();
		System.out.println("Enter City : "+city);
		
		System.out.println("Enter Mobile No : ");
		phone=sc.nextInt();
		System.out.println("Enter Mobile No : "+phone);
		
	}
}