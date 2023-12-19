import java.util.*;
class Perfect_number_day3
{
    public static void main(String args[])
    {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter any positive number :");
        n=s.nextInt();
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
        {
            System.out.print("The entered number is a perfect number");
        }
        else
        {
            System.out.print("The entered number is not a perfect number");
        }
    }
}