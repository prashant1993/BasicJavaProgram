
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;
public class Replace {

	public static void main(String[] args) {
		
		Utility u = new Utility();
		 System.out.print("enter input string: ");
		 String s1 = u.InputString();
		 System.out.print("enter word you want to replace: "); 
		 String s2 = u.InputString();
		 System.out.print("enter new word: ");
		 String s3 = u.InputString();
		 String s4 = s1.replace(s2,s3);
         System.out.println(s4);  
	}

}
