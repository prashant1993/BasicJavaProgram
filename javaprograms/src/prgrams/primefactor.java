package prgrams;
import java.io.*;
import java.util.*;
public class primefactor 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i=2,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int no=sc.nextInt();
		//System.out.println("enter the no");
		//int no=sc.nextInt();
		n=no;
		while(no>0)
		{
		for(i=2;i<=n;i++)
			{
				while(no%i==0)
				{
					System.out.println(""+i);
					no=no/i;
				}
			
			}
		}
	}

}
