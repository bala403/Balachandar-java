import java.util.*;
class vote_day1
{
    public static void main(String arg[])
    {
        int age;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your age :");
        age=s.nextInt();
        if(age>=18)
        {
            System.out.print("You are eligible for voting");
        }
        else
        {
            System.out.print("You can vote after "+(18-age)+" years");
        }
    }
}