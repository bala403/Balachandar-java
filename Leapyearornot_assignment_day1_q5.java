import java.util.*;
class LeapYearOrNot_assignment_day1_q5
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Date (dd/mm/yyyy): ");
        String inputDate = scanner.next();
        scanner.close();
        int year = Integer.parseInt(inputDate.substring(6));
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
        {
            System.out.println("The entered year is a leap year");
        } 
        else 
        {
            System.out.println("The entered year is not a leap year");
        }
    }
}