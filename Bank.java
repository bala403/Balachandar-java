interface Bank 
{
    double getRateOfInterest();
}
class SBI implements Bank 
{
    @Override
    public double getRateOfInterest() 
    {
        return 8.4;
    }
}
class ICICI implements Bank 
{
    @Override
    public double getRateOfInterest() 
    {
        return 7.3;
    }
}
class AXIS implements Bank 
{
    @Override
    public double getRateOfInterest() 
    {
        return 9.7;
    }
}
public class Main 
{
    public static void main(String[] args) 
    {
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank axis = new AXIS();
        System.out.println("SBI Rate of Interest: " + sbi.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + icici.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + axis.getRateOfInterest());
    }
}