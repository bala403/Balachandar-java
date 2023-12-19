import java.util.Scanner;
class Student_marks 
{
    protected int m1, m2, m3, m4;
    protected double aggregate;
    void getdata() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks in python: ");
        m1 = scanner.nextInt();
        System.out.print("Enter the marks in c programming: ");
        m2 = scanner.nextInt();
        System.out.print("Enter the marks in mathematics: ");
        m3 = scanner.nextInt();
        System.out.print("Enter the marks in Physics: ");
        m4 = scanner.nextInt();
        scanner.close();
    }
}
class Average_and_total extends Student_marks 
{
    int total;
    void getdata1() 
    {
        total = m1 + m2 + m3 + m4;
        System.out.println("The total marks acquired by the student is: " + total);
        aggregate = total / 4.0;
        System.out.println("The aggregate of the student is: " + aggregate);
    }
}
public class Grades extends Average_and_total 
{
    void getdata2() 
    {
        if (aggregate >= 75) 
        {
            System.out.println("You got Distinction");
        }
         else if (aggregate >= 60 && aggregate < 75) 
         {
            System.out.println("You got First Division");
        }
         else if (aggregate >= 50 && aggregate < 60) 
         {
            System.out.println("You got Second Division");
        }
         else if (aggregate >= 40 && aggregate < 50) 
         {
            System.out.println("You got Third Division");
        }
         else 
         {
            System.out.println("You got Failed");
        }
    }
    public static void main(String[] args)
     {
        Grades g = new Grades();
        g.getdata();
        g.getdata1();
        g.getdata2();
    }
}
