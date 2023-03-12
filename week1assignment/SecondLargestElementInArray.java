package assignment.week1assignment;
import java.util.*;
public class SecondLargestElementInArray {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		//Get the number of elements in the array using Scanner class
		int n=sc.nextInt();
		//Declare an array as num
		int num[]=new int[n];
		System.out.println("Enter the array elements");
		//Get the array elements using for loop
		for (int i = 0; i <n; i++)
		{
		  num[i]=sc.nextInt();	
		}
		//Sort the array elements in ascending order using sort method
		Arrays.sort(num);
		//Print the second largest element using index position
		System.out.println("Second largest element in the array is "+num[n-2]);

	}

}
