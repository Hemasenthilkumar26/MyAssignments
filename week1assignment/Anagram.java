package assignment.week1assignment;

import java.util.Arrays;

public class Anagram
{
    public static void main(String[] args) 
    {
    	//Declare two strings str1 and str2
		String str1="race";
		String str2="care";
		//Find the length of the strings and store it in seperate variables
		int len1=str1.length();
		int len2=str2.length();
		//Check if the length of the two strings is equal or not
		if(len1!=len2)
			//Print not a anagram if the lengths are not equal
			System.out.println("Not a anagram");
		else
		{
			//Convert the strings into array using toCharArray method
			char[] array1=str1.toCharArray();
			char[] array2=str2.toCharArray();
			//Sort the arrays using sort method
			Arrays.sort(array1);
			Arrays.sort(array2);
			//Compare both arrays using .equals method
			if(Arrays.equals(array1, array2))
				System.out.println("Anagram");
			else
				System.out.println("Not a anagram");
		}

	}

}
