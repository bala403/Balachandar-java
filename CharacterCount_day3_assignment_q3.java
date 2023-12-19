import java.util.Scanner;
public class CharacterCount_day3_assignment_q3
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        System.out.println("Enter characters (enter * to stop): ");
        while (true) 
        {
            char ch = scanner.next().charAt(0);
            if (ch == '*') 
            {
                break;
            }
            if (Character.isUpperCase(ch)) 
            {
                uppercaseCount++;
            }
            else if (Character.isLowerCase(ch)) 
            {
                lowercaseCount++;
            }
            else if (Character.isDigit(ch)) 
            {
                digitCount++;
            }
        }
        System.out.println("Uppercase letters: " + uppercaseCount);
        System.out.println("Lowercase letters: " + lowercaseCount);
        System.out.println("Digits: " + digitCount);
        scanner.close();
    }
}