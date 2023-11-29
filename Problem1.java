import java.util.Scanner;
public class Problem1 {

    public static void main(String str[]){
        int a,b,i;
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the first number : ");
        a=s.nextInt();
        System.out.println("Enter the Second number : ");
        b=s.nextInt();
        System.out.println("Composite numbers between " + a + "and " + b+ " are");
        for(i=a;i<=b;i++){
            int c=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    c++;
                }
            }
            if(c!=0){
                System.out.print(i + " ");
            }
        }

    }
    
}
