import java.util.Scanner;
class Geometry
{
    final double PI = 3.14159;
    double calculateArea(double radius) 
    {
        return PI * radius * radius;
    }
    double calculateVolume(double radius, double height) 
    {
        return PI * radius * radius * height;
    }
    double calculateVolume(double radius, double height, boolean isCone) 
    {
        if (isCone) 
        {
            return (1.0 / 3) * PI * radius * radius * height;
        } 
        else 
        {
            return calculateVolume(radius, height);
        }
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();
        System.out.print("Is it a cone? (true or false): ");
        boolean isCone = scanner.nextBoolean();
        Geometry geometryCalculator = new Geometry();
        double circleArea = geometryCalculator.calculateArea(radius);
        System.out.println("Area of Circle: " + circleArea);
        double volume;
        if (isCone) 
        {
            volume = geometryCalculator.calculateVolume(radius, height, true);
            System.out.println("Volume of Cone: " + volume);
        } 
        else 
        {
            volume = geometryCalculator.calculateVolume(radius, height);
            System.out.println("Volume of Cylinder: " + volume);
        }
        scanner.close();
    }
}