import java.util.*;
class Reverse_of_string_day3
{
    public static void main(String args[])
    {
        String a,reverse="";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any string :");
        a=s.nextLine();
        int length=a.length();
        for(int i=length-1;i>=0;i--)
        {
            reverse=reverse+a.charAt(i);
        }
            System.out.println("The reverse of the entered string is :"+reverse);
    }
}