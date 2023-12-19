import java.util.*;

class Circle {
    protected int r;
    private double area;

    protected void getdata() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        r = s.nextInt();
        area = 3.14 * r * r;
        System.out.println("The area of the circle is: " + area);
    }
}


class Cylinder1 extends Circle {
    private int h;
    private double volume;

    public void getdata() {
        super.getdata(); // Call the getdata method of the parent class to get radius
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the height of the cylinder: ");
        h = s.nextInt();
        volume = 3.14 * r * r * h;
        System.out.println("The volume of the cylinder is: " + volume);
    }

    public static void main(String args[]) {
        Cylinder1 cylinder = new Cylinder1();
        cylinder.getdata();
    }
}
