package assignment.week1assignment;

public class IntersectionOfTwoArrays
{
	public static void main(String[] args) 
	{
				//Declare two arrays
				int a[]= {9,71,11,44,6,90,21};
				int b[]= {21,2,80,4,9,71};
				//Output 9 71 21
				//Declare nested for loop to traverse the two arrays
				for(int i=0;i<a.length;i++)
				{
					for(int j=0;j<b.length;j++)
					{
						//Compare the values of two arrays 
						if(a[i]==b[j])
							System.out.print(a[i]+" ");
					}
				}

	}

}
