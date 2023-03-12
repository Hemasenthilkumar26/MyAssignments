package assignment.week1assignment;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		//Declare an array
		int a[]= {1,5,8,2,4,3,7};
		//Output 6
		//Sort the array using sort method
		Arrays.sort(a);
		//Iterate using for loop
		for(int i=0;i<a.length;i++)
		{
			//Find the missing number using if condition
			if(a[i]!=i+1)
			{
				//Print the missing element
				System.out.println("Missing element is "+(i+1));
				//Break the loop once the missing element is found
				break;
			}
		}

	}

}
