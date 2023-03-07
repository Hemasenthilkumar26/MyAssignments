package week3.day2Assignment;

import java.util.Arrays;

public class ReverseEvenWords {

	public static void main(String[] args) {
		//I ma Manual retseT
		//Declare a String
		String str="I am Manual Tester";
		//Split the string with space and store it in string array
		String[] arr=str.split(" ");
		//Traverse the array and access the even position
		for(int i=1;i<arr.length;i+=2)
		{
			    //Reverse the string at even position and store it in string array
				StringBuilder sc=new StringBuilder(arr[i]);
				arr[i]=sc.reverse().toString();
			
		}
		//Convert the string array into string by using join method
		String reversedString=String.join(" ", arr);
				
		System.out.println(reversedString);
	}

}
