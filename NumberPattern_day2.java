import java.util.Scanner;
public class NumberPattern 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pattern: ");
        int n = scanner.nextInt(); // Number of rows for the pattern
        for (int i = 0; i < n; i++) 
        {
            int num = 1;
            int spaces = n - i - 1;
            for (int j = 0; j <= i; j++) 
            {
                // Print spaces
                for (int k = 0; k < (i - j) / 2; k++) 
                {
                    System.out.print("  ");
                }
                System.out.print(num + " ");
                for (int k = 0; k < (i - j) / 2; k++)
                {
                    System.out.print("  ");
                }
                num = num * (i - j) / (j + 1);
            }            
            System.out.println();
        }
    }
}