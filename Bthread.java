class Athread extends Thread
{
    public void run()
    {
        setPriority(Thread.MIN_PRIORITY);
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println(i+"*7="+7*i);
            }
        }
        catch(Exception e)
        {
            System.out.println(" "+e);
        }
    }
}
class Bthread extends Thread
{
    public void run()
    {
        setPriority(Thread.MAX_PRIORITY);
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println(i+"*9="+9*i);
            }
        }
        catch(Exception e)
        {
            System.out.println(" "+e);
        }
    }
    public static void main(String args[])
    {
        Athread a=new Athread();
        a.start();
        Bthread b=new Bthread();
        b.start();
    }
}