package assignment.week1assignment;

public class ReverseString {

	public static void main(String[] args) {
		//Declare a string 
		String str="TestLeaf";
		//Output faeLtseT
		System.out.println("Actual String "+str);
		System.out.print("Reversed String ");
		//Convert the string into array using toCharArray method
		char[] ch=str.toCharArray();
		//Iterate the array in reverse order using for loop 
		for(int i=ch.length-1;i>=0;i--) {
			//Print the character
			System.out.print(ch[i]);
			
		}

	}

}
