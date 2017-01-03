import java.io.*;
import java.util.*;
class strong 
{
public static void main(String args[])
{
int i,sum=0,fact,n,no1;
Scanner sc =new Scanner(System.in);
System.out.println("enter the no");
int no=sc.nextInt();
no1=no;
sum=0;
while(no>0)
{
n=no%10;
fact=1;
for(i=1;i<=n;i++)
{
fact=fact*i;
}
sum=sum+fact;
no=no/10;
}

System.out.println(""+sum);

if(no1==sum)
System.out.println("no is strong");
else 
System.out.println("no is not strong");
}
}
