import java.util.Scanner;

/**
 * Problem1-day2
 */
public class Problem1_day2 {
    public static void main(String str[]){
        int n,i,N,M;
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
        System.out.println("Enter the element M :");
        M=s.nextInt();
        System.out.println("Enter the element N : ");
        N=s.nextInt();
        
        System.out.println("The " + M + "th largest element is " + arr[n-M-1]);
        System.out.println("The " + N + "th largest element is " + arr[N-1]);
        System.out.println("The sum is " + (arr[n-M-1]+arr[N-1]));
        System.out.println("The difference is " + (arr[n-M-1]-arr[N-1]));

    }

    
}