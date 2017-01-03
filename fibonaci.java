import java.io.*;
import java.util.*;
class fibonaci
{
public static void main(String args[])
{
int n,prev=0,next=1,result,i=1;
Scanner sc =new Scanner(System.in);
System.out.println("enter the no");
n=sc.nextInt();
System.out.println(+next);

while(i<n)
{
result=next+prev;
prev=next;
next=result;
i++;
if(result<=n)
System.out.println(""+result);
}
}
}
