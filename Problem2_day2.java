import java.util.Scanner;

public class Problem2_day2 {
    public static void main(String str[]){
        int n500,n2000,n100,n200;
        int bal=0;
        int x,y;
        Scanner s=new Scanner(System.in);
        for(int i=1;i<5;i++){
            System.out.println("Enter the denomination " + i);
            x=s.nextInt();
            System.out.println("Enter number of notes : ");
            y=s.nextInt();
            if(x==2000){
                bal+=2000*y;
            }
            else if(x==500){
                bal+=500*y;
            }
            else if(x==100){
                bal+=100*y;
            }
            else if(x==200){
                bal+=200*y;
            }

        }
        System.out.println("The available balance is " + bal);

    }
    
}
