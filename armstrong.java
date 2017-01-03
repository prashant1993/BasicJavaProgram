import java.io.*;
import java.util.*;
class armstrong
{
public static void main(String args[])
{
int n,no1,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
int no=sc.nextInt();
no1=no;
while(no>0)
{
n=no%10;
sum=sum+(n*n*n);
no=no/10;
}
if(sum==no1)
System.out.println("no is Armstrong");
else
System.out.println("not Armstrong");
}
}


