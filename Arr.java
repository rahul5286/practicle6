import java.util.*;

class Arr
{
	public static void main(String arg[])
	{
		int arr[]=new int[10];
		int no,i;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array ElemrntL:-");
		no=sc.nextInt();
		
		for(i=0;i<no;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(i=0;i<no;i++)
		{
			System.out.println("Array Element :-"+arr[i]);
		}
	}
}