package week3.day2Assignment;

import java.util.Arrays;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		//Declare a String
		String str="testleaf";
		//Convert the string into character array
		char[]ch=str.toCharArray();
		//Traverse through the character array and find the odd index
		for(int i=0;i<str.length();i++)
		{
			if(i%2!=0)
			{	//Convert the character to upper case
				ch[i]=Character.toUpperCase(ch[i]);	
			}		
			
		}
		//print the output
		System.out.println(ch);	

	}

}
