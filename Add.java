import java.util.*;
class Add
{
    void sum(int a,int b)
    {
        int c=a+b;
        System.out.println("The sum is :"+c);
    }
    void sum(int x,int y, int z)
    {
       int k=x+y+z;
        System.out.println("The sum is :"+k);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value of a :");
        int a=s.nextInt();
        System.out.print("Enter the value of b:");
        int b=s.nextInt();
        Add Sai=new Add();
        Sai.sum(a,b);
        System.out.print("Enter the value of x:");
        int x=s.nextInt();
        System.out.print("Enter the value of y :");
        int y=s.nextInt();
        System.out.print("Enter the value of z :");
        int z=s.nextInt();
        Sai.sum(x,y,z);
    }
}