import java.util.*;
class Interest_assignment_day1_q4
{
    public static void main(String args[])
    {
        int principalinterest,time,roi,simpleinterest;
        String citizen;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the amount taken as loan :");
        principalinterest=s.nextInt();
        System.out.print("Enter the time period :");
        time=s.nextInt();
        System.out.print("Type y if you are senior citizen else type n :");
        citizen=s.next();
        if(citizen.equals("y"))
        {
            roi=12;
            simpleinterest=principalinterest*time*roi/100;
            System.out.print("The simple interest is :"+simpleinterest);
        }
        else
        {
            roi=10;
            simpleinterest=principalinterest*time*roi/100;
            System.out.print("The simple interest is :"+simpleinterest);
        }
    }
}