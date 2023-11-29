import java.util.Scanner;

public class Problem2 {
    public static void main(String str[]){
    int n,c,i;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number");
    n=s.nextInt();
    c=0;
    for(i=1;i<=n;i++){
        if(n%i==0){
            c++;
        }
    }
    System.out.println("There are " + c + " factors");

    }
    
}
