import java.util.Scanner;
class Character_present_in_a_string_or_not_day3_assignment_q1
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter the character to be searched: ");
        char searchChar = scanner.next().charAt(0);
        boolean isPresent = false;
        for (int i = 0; i < inputString.length(); i++) 
        {
            char ch = inputString.charAt(i);
            if (ch == searchChar) 
            {
                isPresent = true;
                break;
            }
        }
        if (isPresent) 
        {
            System.out.println("The character '" + searchChar + "' is present in the string.");
        } 
        else 
        {
            System.out.println("The character '" + searchChar + "' is not present in the string.");
        }
        scanner.close();
    }
}