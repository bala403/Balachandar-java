import java.util.*;
class Error
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=s.nextInt();
        System.out.print("Enter the value of b :");
        int b=s.nextInt();
        s.close();
        try
        {
            int x=a/b;
            System.out.print("The division of the two numbers is :"+x);
        }
        catch(Exception  e)
        {
            System.out.print(" "+e);
        }
    }
}