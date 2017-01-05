package prgrams;
import java.util.Scanner;

public class harmonic {
	public static void main(String args[])
	{
		//int i;
		float i,j=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		Float no=sc.nextFloat();
		for(i=2;i<=no;i++)
		{
			//System.out.println("1/"+i);
			j=(j+(1/i));
			//System.out.println(""+j);
		}
		System.out.println("harmonic no is"+j);
	}
}
