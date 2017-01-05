package com.bridgeit.utility;

import java.util.Scanner;

public class Utility {
	
	Scanner sc ;
	
	public Utility()
	{
		sc=new Scanner(System.in);
	}

	public String  InputString()
	{
		return sc.nextLine();
	}
}
