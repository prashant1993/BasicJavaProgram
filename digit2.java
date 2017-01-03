import java.io.*;
import java.util.*;
class digit2
{
public static void main(String args[])
{
int no,n,rev=0;
Scanner sc =new Scanner(System.in);
System.out.println("enter the no");
 no=sc.nextInt();
while(no>0)
{
n=no%10;
rev=(rev*10)+n;
no=no/10;
}
System.out.println("the Reverse Digit is"+rev);
}
}
