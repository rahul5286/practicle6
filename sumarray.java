import java.util.*;

class sumarray
{
	public static void main(String arg[])
	{
		int arr[]=new int[10];
		int no,i,sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Element:- ");
		no=sc.nextInt();
		
		for(i=0;i<no;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(i=0;i<no;i++)
		{
			sum=sum+arr[i];	
		}
		System.out.println("Array Element :- "+sum);
	}
}