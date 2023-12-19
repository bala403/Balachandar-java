import java.util.Scanner;

public class CollegeUsers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of student users: ");
        int studentUsers = scanner.nextInt();

        System.out.print("Enter the total number of users: ");
        int totalUsers = scanner.nextInt();

        System.out.print("Enter the number of staff users: ");
        int staffUsers = scanner.nextInt();
        int nonTeachingStaffUsers = staffUsers / 3;
        System.out.println("\nNumber of Student Users: " + studentUsers);
        System.out.println("Total Users: " + totalUsers);
        System.out.println("Number of Staff Users: " + staffUsers);
        System.out.println("Number of Non-Teaching Staff Users: " + nonTeachingStaffUsers);

        scanner.close();
    }
}
