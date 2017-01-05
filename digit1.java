import java.io.*;
import java.util.*;
class digit1
{
public static void main(String args[])
{
int no,sum=0,n;
Scanner sc =new Scanner(System.in);
System.out.println("enter the digit");
no=sc.nextInt();
while(no>0)
{
n=no%10;
sum=sum+n;
no=no/10;
}
System.out.println("digit is"+sum);
}
}
