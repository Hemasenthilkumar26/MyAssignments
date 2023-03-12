package assignment.week1assignment;

public class DuplicareElementInArray {

	public static void main(String[] args) {
		   int a[]= {1,2,3,4,5,4,2,3,6,7,5,4};
	        // Output 2,3,4,5
		    //Declare a variable as count with value 0
	        int count=0;
	        //Iterate the values from index 0 to array length-1
	        for (int i = 0; i < a.length; i++) {
	        	count=1;
	        	//add the inner loop, to compare the values
				for (int j = i+1; j < a.length; j++) {
					//Compare two values to find the duplicate element
					if(a[i]==a[j])
					{
						//Increment the count variable 
						count++;
						//Store a dummy value in a[j]
						a[j]=99;	
					}
				}
				//check the number is duplicate or not by checking the conditions
				if(count>1 && a[i]!=99)
				{
					//Print the duplicate element
					System.out.print(+a[i]+" ");
				}
			}
	  }
}
