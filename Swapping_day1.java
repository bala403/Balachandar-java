import java.util.*;
class Swapping_day1
{
    public static void main(String args[])
    {
        int a,b,temp;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value of a :");
        a=s.nextInt();
        System.out.print("Enter the value of b :");
        b=s.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.print("The numbers after swapping is :"+a+" "+b);
    }
}