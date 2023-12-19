import java.util.Scanner;
class StudentRecord 
{
    private String name;
    private int registrationNumber;
    private int[] marks = new int[5];
    private int totalMarks;
    private double averageMarks;
    void setName(String studentName)
     {
        name = studentName;
    }
    void setRegistrationNumber(int regNumber) 
    {
        registrationNumber = regNumber;
    }
    void setMarks(int[] subjectMarks) 
    {
        marks = subjectMarks;
    }
    void calculateTotalMarks() 
    {
        for (int mark : marks) {
            totalMarks += mark;
        }
    }

    void calculateAverageMarks() 
    {
        averageMarks = (double) totalMarks / marks.length;
    }

    public void displayStudentInfo() 
    {
        System.out.println("Student Name: " + name);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Subject Marks: ");
        for (int i = 0; i < marks.length; i++) 
        {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
    }
}
class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        StudentRecord student = new StudentRecord();
        System.out.print("Enter student name: ");
        student.setName(scanner.nextLine());
        System.out.print("Enter registration number: ");
        student.setRegistrationNumber(scanner.nextInt());
        int[] marks = new int[5];
        System.out.println("Enter subject marks:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        student.setMarks(marks);
        student.calculateTotalMarks();
        student.calculateAverageMarks();
        student.displayStudentInfo();
        scanner.close();
    }
}