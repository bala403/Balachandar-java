import java.util.*;
class LastWord
{
public static void main(String args[])
{
String s1;
int len;
int c=0;
String s2="";
Scanner s=new Scanner(System.in);
System.out.println("enter the string:");
s1=s.nextLine();
len=s1.length();
for(int i=len-1;i>=0;i--)
{
s2=s2+s1.charAt(i);
}
System.out.println(s2);
int w=s2.length();
char a[]=new char[w];
for(int i=0;i<w;i++)
{
a[i]=s2.charAt(i);
if(a[i]==' ')
{
break;
}
else
{
c++;
}
}
System.out.println(c);
}
}