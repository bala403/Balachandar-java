class Student 
{
    private String studentName;
    private int registerNumber;
    private int[] subjectMarks = new int[5];
    private int totalMarks;
    private double averageMarks;
    public Student(String studentName, int registerNumber, int[] subjectMarks) 
    {
        this.studentName = studentName;
        this.registerNumber = registerNumber;
        this.subjectMarks = subjectMarks;
    }
    public void calculateTotalMarks() 
    {
        for (int mark : subjectMarks) 
        {
            totalMarks += mark;
        }
    }
    public void calculateAverageMarks() 
    {
        averageMarks = (double) totalMarks / subjectMarks.length;
    }
    public void displayStudentDetails() 
    {
        System.out.println("Student Name: " + studentName);
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Subject Marks: ");
        for (int i = 0; i < subjectMarks.length; i++) 
        {
            System.out.println("Subject " + (i + 1) + ": " + subjectMarks[i]);
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
    }
}