import java.util.Scanner;
public class Problem3 {
    public static void main(String str[]){
        String a;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string : ");
        a=s.nextLine();
        int n=a.length();
        for(int i=0;i<n;i++){
            int flag=0;
            for(int j=i+1;j<n;j++){
                if(a.charAt(i)==a.charAt(j)){
                    flag=1;
                }
            }
            if(flag==0){
                System.out.println(a.charAt(i));
            }
        }

    }
    
}
