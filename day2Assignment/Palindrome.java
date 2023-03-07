package week3.day2Assignment;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//Get the input from the user
		System.out.println("Enter the String");
		//Store the input value in string
		String str=sc.nextLine();
		//Initialize a string to store revered string
		String rev="";
		//Traverse the string in reverse
		for(int i=str.length()-1;i>=0;i--)
		{	
			//Append the character
			rev=rev+str.charAt(i);
		}
		//check if the revered string and the original string is equal
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}
