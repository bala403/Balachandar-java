import java.util.Scanner;

public class NumberPattern33 {
    public static void main(String str[]){
        int i,j,k,n,l;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no.of rows : ");
        n=s.nextInt();
        for(i=1;i<=n/2+1;i++){
            System.out.println();
            for(j=1;j<=i;j++){
                System.out.print( "1 ");
            }
            
        }
        for(l=n/2;l>0;l--){
            System.out.println();
            for(k=0;k<l;k++){
                System.out.print( "1 ");
            }
        }
    }
    
}
