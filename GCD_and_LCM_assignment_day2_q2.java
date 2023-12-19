import java.util.*;
class GCD_and_LCM_assignment_day2_q2
{
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = s.nextInt();
        int lcm = 1, gcd = 0;
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = s.nextInt();
            lcm = calculateLCM(num, lcm);
            gcd = calculateGCD(num, gcd);
        }
        System.out.println("LCM = " + lcm);
        System.out.println("GCD = " + gcd);
    }
    public static int calculateLCM(int a, int b) 
    {
        return (a * b) / calculateGCD(a, b);
    }
    public static int calculateGCD(int a, int b) 
    {
        if (b == 0) 
        {
            return a;
        }
        return calculateGCD(b, a % b);
    }
}