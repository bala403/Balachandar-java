import java.util.*;
class Citizen_day1
{
       public static void main(String arg[])
    {
        int age;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your age :");
        age=s.nextInt();
        if(age>=0 && age<=8)
        {
            System.out.print("Kids");
        }
        else if(age>=9 && age<=18)
        {
            System.out.print("Teenager");
        }
        else if(age>=19 && age<=39)
        {
            System.out.print("Adults");
        }
        else if(age>=40 && age<=59)
        {
            System.out.print("Elders");
        }
        else
        {
            System.out.print("Senior Citizens");
        }
    }
}