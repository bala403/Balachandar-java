class Mtable implements Runnable
{
    public void run()
    {
        try
        {
            int i;
            Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
            for(i=1;i<=10;i++)
            {
                System.out.println(i+"* 13 ="+i*13);
            }   
        }
        catch(Exception e)
        {
            System.out.println(" "+e);
        }
        finally
        {
            System.out.println("First interface is completed");
        }
    }
}
class Mtable1 implements Runnable
{
    public void run()
    {
        try
        {
            int i;
            Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
            for(i=1;i<=10;i++)
            {
                System.out.println(i+"*17="+i*17);
            }
        }
        catch(Exception e)
        {
            System.out.println(" "+e);
        }
        finally
        {
            System.out.println("Second interface is completed");
        }
    }
    public static void main(String args[])
    {
        Mtable m=new Mtable();
        Thread t1=new Thread(m);
        t1.start();
        Mtable1 m1=new Mtable1();
        Thread t2=new Thread(m1);
        t2.start();
    }
}