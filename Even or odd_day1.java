import java.util.*;
class Even_day1
{
    public static void main(String arg[])
    {
        int a;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of a :");
        a=s.nextInt();
        if(a%2==0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is odd");
        }
    }
}