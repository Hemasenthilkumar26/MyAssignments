package week1.day1;

public class TwoWheeler
{
	int noOfWheels=2;
	short noOFMirrors=2;
	long chassisNumber=142461382;
	boolean isPunctured=true;
	String bikeName="Royal Enfield";
	double runningKM=31000.57;
public static void main(String[] args) 
{
	TwoWheeler myBike =new TwoWheeler();
	System.out.println(myBike.bikeName);
	System.out.println("chassisNumber=" +myBike.chassisNumber);
	System.out.println("isPunctured=" +myBike.isPunctured);
	System.out.println("runningKM="+myBike.runningKM);
	System.out.println("noOfwheels="+myBike.noOfWheels);
	System.out.println("noOfMirrors="+myBike.noOFMirrors);
	
}
}
