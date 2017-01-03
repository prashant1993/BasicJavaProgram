import java.io.*;
import java.util.*;
class prime 
{
public static void main(String args[])
{
int ch=0,i,j;
Scanner sc =new Scanner(System.in);

System.out.println("enter the starting no");
int no1=sc.nextInt();

System.out.println("enter the ending no");
int no2=sc.nextInt();

System.out.println("prime no between"+no1  +" "+no2);

while(no1<no2)
{
for(i=2;i<no1/2;i++)
{
ch=0;
if(no1%i==0)
{
ch=1;
break;
}
}
if(ch==0)
System.out.println(""+no1);
no1++;
}

}
}
