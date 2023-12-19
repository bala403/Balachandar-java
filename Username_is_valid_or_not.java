import java.util.*;
class Username_is_valid_or_not
{
    public static void main(String args[])
    {
        String x,y;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the username :");
        x=s.nextLine();
        System.out.print("Please re-enter your username :");
        y=s.nextLine();
        if(x.equals(y))
        {
            System.out.print("The entered username is valid");
        }
        else
        {
            System.out.print("The entered username is not valid");
        }
    }
}