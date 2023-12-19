import java.util.*;
class c_sum_of_numbers
{
    public static void main(String args[])
    {
        try
        {
            Scanner s=new Scanner(System.in);
            int a,sum=0;
            System.out.println("Enter the total number of elements to be :");
            a=s.nextInt();
            int arr[]=new int[2];
            System.out.println("Enter the elements :");
            for(int i=0;i<a;i++)
            {
                arr[i]=s.nextInt();
            }
            for(int i=0;i<a;i++)
            {
                sum=sum+arr[i];
            }
            System.out.println("The sum is :"+sum);
        }
        catch(Exception e)
        {
            System.out.println(" "+e);
        }
    }
}