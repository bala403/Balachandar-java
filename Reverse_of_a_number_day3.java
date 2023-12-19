import java.util.*;
class Reverse_of_a_number_day3
{
    public static void main(String args[])
    {
        int n,remainder,reverse=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter any number :");
        n=s.nextInt();
        while(n>0)
        {
            remainder=n%10;
            reverse=reverse*10+remainder;
            n=n/10;
        }
        System.out.print("The reverse of the entered number is :"+reverse);
    }
}