import java.util.Scanner;

public class CollegeUser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Total Users: ");
        int totalUsers = scanner.nextInt();

        System.out.print("Enter Staff Users: ");
        int staffUsers = scanner.nextInt();

        int nonTeachingStaff = staffUsers / 3; 
        int studentUsers = totalUsers - staffUsers - nonTeachingStaff; 

        System.out.println("Student Users: " + studentUsers);

        scanner.close();
    }
}
