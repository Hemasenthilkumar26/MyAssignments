package assignment.week1assignment;

import java.util.Scanner;

public class PrintOddNumberWithinRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		//Get the input range using Scanner class
		int start=sc.nextInt();
		int end=sc.nextInt();
		System.out.println("Odd numbers within the given range are ");
		//Iterate through the given range 
		for (int i =start; i <=end; i++)
		{
			//Check if the number is odd or not using if condition
			if(i%2==1)
			{
				System.out.print(i+" ");
			}
		}

	}

}
