import java.util.*;
class Circle
{
    protected int r;
    private double area;
    void getdata1()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the radius :");
        r=s.nextInt();
        area=3.14*r*r;
        System.out.println("The radius of the circle is :"+area);
    }
}
class Cylinder extends Circle
{
    private int h;
    private double volume;
    void getdata2()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the height of the cylinder :");
        h=s.nextInt();
        volume=3.14*r*r*h;
        System.out.println("The circumference of the cylinder is :"+volume);
    }
    public static void main(String args[])
    {
        Cylinder cylinder=new Cylinder();
        cylinder.getdata1();
        cylinder.getdata2();
    }
}