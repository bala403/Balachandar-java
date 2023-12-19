import java.util.*;
class Common
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		int b[]=new int[10];
		int n1,n2,i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("enter elements of first array:");
		n1=s.nextInt();
		System.out.println("enter elements: ");
		for(i=0;i<n1;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter elements of second array:");
		n2=s.nextInt();
		System.out.println("enter elements: ");
		for(i=0;i<n2;i++)
		{
			b[i]=s.nextInt();
		}
		System.out.println("common elements are: ");
		for(i=0;i<n1;i++)
		{
			for(j=0;j<n2;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}