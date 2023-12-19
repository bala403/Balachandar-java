import java.util.Scanner;
class number_of_vowels_in_the_given_string_day3
{
    public static void main(String args[]) 
    {
        String x;
        String vowels = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any string: ");
        x = s.nextLine();
        for (int i = 0; i < x.length(); i++) 
        {
            char ch = x.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
                {
                vowels += ch;
                }
        }
        System.out.println("Vowels present in the given string: " + vowels);
        s.close();
    }
}