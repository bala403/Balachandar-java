import java.util.*;
class Duplicate
{
	public static void main(String args[])
	{
		int n,i,j,k;
		int a[]=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value: ");
		n=s.nextInt();
		System.out.println("enter the elements: ");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					for(k=j;k<n-1;k++)
					{
						a[k]=a[k+1];
					}
					n--;
					j--;

				}
			}
		}
		System.out.println("after removing duplicates: ");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}