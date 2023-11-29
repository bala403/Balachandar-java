import java.util.Scanner;

public class Problem3_day2 {
    public static void main(String str[]){
        int sal,bonus=0,total;
        String grade;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Grade :");
        grade=s.next();
        System.out.println("Enter the Salary : ");
        sal=s.nextInt();
        String a="A";
        String b="B";
        if(grade.equals(a)){
            bonus=(5*sal)/100;
        }
        else if(grade.equals(b)){
            bonus=(10*sal)/100;

        }
        if(sal<10000){
            bonus+=(2*sal)/100;
        }
        System.out.println("Salary : " + sal);
        System.out.println("Bonus : " + bonus);
        total=sal+bonus;
        System.out.println("Total : " + total);
            
        
    }
    
}
