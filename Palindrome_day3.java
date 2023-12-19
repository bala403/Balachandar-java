import java.util.*;
class Palindrome_day3 
{
    public static void main(String args[]) 
    {
        String original, reverse = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any string: ");
        original = s.nextLine();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--) 
        {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)) 
        {
            System.out.println("The entered string is a palindrome");
        } 
        else 
        {
            System.out.println("The entered string is not a palindrome");
        }
    }
}