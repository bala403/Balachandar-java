import java.util.Scanner;

public class Problem5_day2 {
    public static void main(String str[]){
        int n,i,N;
        int arr[]=new int[50];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no.of elements in the array : ");
        n=s.nextInt();
        for(i=0;i<n;i++){
            System.out.println("Enter element " + i);
            arr[i]=s.nextInt();


        }
        for(i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println("Enter the number N : ");
        N=s.nextInt();
        System.out.println(N + "th largest element :  " + arr[n-N]);
    }



}
