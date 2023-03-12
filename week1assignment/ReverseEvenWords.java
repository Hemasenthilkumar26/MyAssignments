package assignment.week1assignment;

public class ReverseEvenWords {

	public static void main(String[] args) 
	{
		//Declare a String
		String str="I am manual and automation tester";
		System.out.println(str);
		// Output--> I ma Manual retseT
		//Split the string and store it in string array using split method
		String[] array=str.split(" ");
		//Traverse the array using for loop
		for(int i=1;i<array.length;i+=2)
		  {
		     StringBuilder sc=new StringBuilder(array[i]);
		     //Reverse the word at even position and store it in string array
		     array[i]=sc.reverse().toString();
					
		  }
		 //Convert the string array into string by using join method
		 String reversedString=String.join(" ", array);
		 System.out.println(reversedString);
	}

}
