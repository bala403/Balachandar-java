import java.util.*;
class Powerofthree_assignment_day1_q3
{
    public static void main(String args[])
    {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter any positive number :");
        n=s.nextInt();
        boolean isPowerOfThree = true;
        while (n > 1) 
        {
            if (n % 3 != 0) 
            {
                isPowerOfThree = false;
                break;
            }
            n /= 3;
        }
        System.out.println("Output: " + isPowerOfThree);
    }
}