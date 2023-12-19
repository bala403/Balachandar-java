import java.util.*;
class Area_of_circle_day1
{
    public static void main(String args[])
    {
        float area,radius;
       Scanner s=new Scanner(System.in);
       System.out.print("Enter the radius of circle :");
       radius=s.nextInt();
       area=3.14f*radius*radius;
       System.out.print("The area of the circle is :"+area); 
    }
}