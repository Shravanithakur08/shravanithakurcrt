import java.util.*;
class Array
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int i,j; 
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
Arrays.sort(a);
for(i=0;i<n;i++)
{
if(a[i]>0)
break;
}
for(j=i;j<n;j++)
{
if(a[j]+1!=a[j+1])
{
System.out.println(a[j]+1);
break;
}
}
if(i==n-1)
System.out.println(a[n-1]+1);
}
}
