package assignment.week1assignment;

public class SwapTwoNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		//Declare two numbers
		int x=155,y=210;
		System.out.println("Before swapping x="+x+" y="+y);
		//Output x=210 y=155
		//Multiply x and y and store it in x
		x=x*y;
		//Divide x by y and store it in y
		y=x/y;
		//Divide x by y and store it in x
		x=x/y;
		System.out.println("After swapping x="+x+" y="+y+" ");

	}

}
