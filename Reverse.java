class Fibonnacithread extends Thread
{
    public void run()
    {
        try
        {
            int n1=0,n2=1,n3;
           int count=0;
           setPriority(Thread.MIN_PRIORITY);
            while(count<10)
            {
                System.out.println(n1 + " ");
                n3=n1+n2;
                n1=n2;
                n2=n3;
                count++;
            }
        }
        catch(Exception e)
        {
            System.out.println(""+e);
        }
        finally
        {
            System.out.println("Thread A is completed");
        }
    }
}
class Reverse extends Thread
{
    public void run()
    {
        try
        {
            int i;
            setPriority(Thread.MAX_PRIORITY);
            for(i=10;i>=1;i--)
            {
                System.out.println(" "+i);
            }
        }
        catch(Exception e)
        {
            System.out.println(" "+e);
        }
        finally
        {
            System.out.println("Thread B is completed");
        }
    }
     public static void main(String args[])
        {
            Fibonnacithread f=new Fibonnacithread();
            f.start();
            Reverse r=new Reverse();
            r.start();
        }
}  