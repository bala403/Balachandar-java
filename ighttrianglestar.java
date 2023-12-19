import java.util.*;
class Righttrianglestar{
public static void main(String args[]){
int i,j,rows;
Scanner s = new Scanner(System.in);
System.out.println("Enter the number of rows");
rows = s.nextInt();
for(i=1;i<=rows;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("* ");
}
System.out.println("");
}
}
}