import java.util.Scanner;
class SumOfDigits_day1
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();    
        int sum = calculateSumOfDigits(number);
        int singleDigitSum = calculateSingleDigitSum(sum);
        System.out.println("Single digit sum: " + singleDigitSum);
    }
    private static int calculateSumOfDigits(int num) 
    {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    private static int calculateSingleDigitSum(int num) 
    {
        if (num < 10) 
        {
            return num; // If num is already a single digit, return num
        } 
        else 
        {
            return calculateSingleDigitSum(calculateSumOfDigits(num)); // Recursively calculate sum of digits
        }
    }
}