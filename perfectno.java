import java.io.*;
import java.util.*;
class perfectno
{
public static void main(String args[])
{
int no=0,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
int n=sc.nextInt();
for(i=1;i<n;i++)
{
if(n%i==0)
{
no=no+i;
}
}
if(n==no)
System.out.println(+n+"no is perfect");
else 
System.out.println(+n+"not perfect no");
}
}
