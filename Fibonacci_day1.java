import java.util.Scanner;
class Fibonacci_day1
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms to generate: ");
        int n = scanner.nextInt();
        scanner.close();
        int firstNum = 0;
        int secondNum = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        System.out.print(firstNum + " " + secondNum + " ");       
        for (int i = 3; i <= n; i++) 
        {
            int nextNum = firstNum + secondNum;
            System.out.print(nextNum + " ");
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}