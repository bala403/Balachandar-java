class Superclass 
{
    int num;
    Superclass(int num) 
    {
        this.num = num;
    }
    void display() 
    {
        System.out.println("Superclass Number: " + num);
    }
}
class Subclass extends Superclass 
{
    int num;
    Subclass(int num1, int num2) 
    {
        super(num1);
        this.num = num2;
    }
    void display() 
    {
        super.display(); 
        System.out.println("Subclass Number: " + num);
    }
    public static void main(String[] args) 
    {
        Subclass obj = new Subclass(100, 200);
        obj.display();
    }
}