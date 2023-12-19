import java.util.*;
class MultiplicationTable_assignment_day1_q1
{
    public static void main(String args[])
    {
        int m,n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value of m :");
        m=s.nextInt();
        System.out.print("Enter the value of n :");
        n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(m+"x"+i+"="+(m*i));
        }
    }
}