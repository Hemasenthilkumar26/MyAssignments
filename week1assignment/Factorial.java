package assignment.week1assignment;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		//Get input from the user using scanner class
		int n=sc.nextInt();
		//Declare a variable as fact with value 1
		int fact=1;
		//Iterate in reverse order using for loop
		for(int i=n;i>0;i--)
		{
			//Calculate the factorial and store it in fact variable
			fact=fact*i;
		}
		//Print the output
		System.out.println(fact);
	}

}
