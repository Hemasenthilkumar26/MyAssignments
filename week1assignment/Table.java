package assignment.week1assignment;
import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		//Get input from the user using scanner class
		int num=sc.nextInt();
		//Iterate using for loop
		for(int i=1;i<=10;i++)
		{ 
			//Multiply and store it in variable result
			int result=num*i;
			//Print the output
			System.out.println(i+"*"+num+"="+result);
		}

	}

}
