package assignment.week1assignment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Get the input string using Scanner class
		System.out.println("Enter the String");
		//Store the input value in string
		String str=sc.nextLine();
		//Convert the input string into lower case using toLowerCase method
		String string=str.toLowerCase();
		//Declare an empty string to store the revered string
		String rev="";
		//Traverse the string in reverse order
		for(int i=string.length()-1;i>=0;i--)
		{	
			//Append the character to the empty string
			rev=rev+string.charAt(i);
		}
		//check if the revered string and the original string is equal
		if(string.equals(rev)) {
			System.out.println("It is a Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}

	}

}
