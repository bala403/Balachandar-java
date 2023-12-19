import java.util.*;
class DecimaltoBinaryandOctal_assignment_day1_q2
{
    public static void main(String args[])
    {
        int decimalnumber;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter any decimal number :");
        decimalnumber=s.nextInt();
        String binarynumber="";
        int tempDecimal=decimalnumber;
        while(tempDecimal>0)
        {
            binarynumber=tempDecimal%2+binarynumber;
            tempDecimal/=2;
        }
        String octalnumber="";
        tempDecimal=decimalnumber;
        while(tempDecimal>0)
        {
            octalnumber=tempDecimal%8+octalnumber;
            tempDecimal/=8;
        }
        System.out.println("The binary number of the entered decimal number is :"+binarynumber);
        System.out.println("The octal number of the entered decimal number is :"+octalnumber);
    }
}