import java.util.*;
class SunLight
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int c=1;
int large=a[0];
for(int i=1;i<n;i++)
{
if(large<a[i])
{
c++;
}
}
System.out.print(c);
}
}
