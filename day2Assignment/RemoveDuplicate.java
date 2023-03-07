package week3.day2Assignment;
import java.util.*;
public class RemoveDuplicate {

	public static void main(String[] args) {
		//We learn java basics as part of sessions in week1
		//Declare a string
		String text="We learn java basics as part of java sessions in java week1";
		int count=0;
		//Split the string with space and store it in string array
		String[] str=text.split(" ");
		//Take one word at a time and compare it with rest of the words
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				//If it is a matching word then replace it with empty string
				if(str[i].equals(str[j]))
				{
					str[j]="";
				}
			}			
		
		}
		//Initializing a string to store the output
		String output="";
		//Traverse the String array 
		for (int i = 0; i < str.length; i++) {
			//Add the string to the output string if it is not empty
			if(str[i]!="") {
				if(i==str.length-1) {
					output=output+str[i];
				}
				//Add space in between the words
				else{
					output=output+str[i]+" ";
				}
			}
			
			
		}
		System.out.println(output);
	

	}

}
