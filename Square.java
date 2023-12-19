import java.util.*;
class Square{
public static void main(String str[]){
int l,u;
Scanner s=new Scanner(System.in);
System.out.println("Enter the lower limit : ");
l=s.nextInt();
System.out.println("Enter the upper limit : ");
u=s.nextInt();
int n=u-l;
int arr[][]=new int[n+1][2];
for(int i=0;i<=n;i++){
arr[i][0]=l+i;
arr[i][1]=(l+i)*(l+i);
}
for(int i=0;i<n;i++){
System.out.print("(" +arr[i][0] + " " + arr[i][1] + ")");
}
}
}