package assignment.week1assignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		//Declare a String
		String str="testleaf";
		System.out.println(str);
		//Convert the string into character array
		char[]ch=str.toCharArray();
		//Traverse through the character array and find the odd index
		for(int i=0;i<ch.length;i++)
			{
				if(i%2==1)
					{	
					    //Convert the character into upper case using toUpperCase method
						ch[i]=Character.toUpperCase(ch[i]);	
					}		
					
			}
			//print the output
			System.out.println(ch);	

	}

}
