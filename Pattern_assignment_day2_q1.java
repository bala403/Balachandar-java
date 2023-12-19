import java.util.*;
class Pattern_assignment_day2_q1
{
    public static void main(String args[]) 
    {
        int n, i, j;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        n = s.nextInt();
        for (i = 1; i <= n; i++) 
        {
            for (j = 1; j <= n - i; j++) 
            {
                System.out.print("  ");
            }
            for (j = 1; j <= i; j++) 
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        for (i = n - 1; i >= 1; i--) 
        {
            for (j = 1; j <= n - i; j++) 
            {
                System.out.print("  ");
            }
            for (j = 1; j <= i; j++) 
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}