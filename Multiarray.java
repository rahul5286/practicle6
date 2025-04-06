import java.util.*;

class Multiarray
{
	public static void main(String arg[])
	{
		int arr[][]=new int[10][10];
		int no,i,sum=0,j,r,c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No Of Row:-");
		r=sc.nextInt();
		
		System.out.println("Enter No Of Column:-");
		c=sc.nextInt();
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
}