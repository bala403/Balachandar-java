import java.util.*;
class Message
{
    void display()
    {
        System.out.println(" ");
    }
    void display(String b)
    {
        for(int i=1;i<=2;i++)
        {
            System.out.println(" "+b);
        }
    }
    void display(String c,int d)
    {
        for(int i=1;i<=d;i++)
        {
            System.out.println(" "+c);
        }
    }
    public static void main(String args[])
    {
        Message Display=new Message();
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the message 1:");
        String a=s.nextLine();
        Display.display(a);
        System.out.print("Enter the message 2:");
        String b=s.nextLine();
        Display.display( b);
        System.out.print("Enter the message 3:");
        String c=s.nextLine();
        int d=s.nextInt();
        Display.display( c, d);
        s.close();
    }
}