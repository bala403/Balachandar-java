import java.util.*;
class Pattern
{
    public static void main(String args[])
    {
        int n,i,j;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value of n :");
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
    }
}