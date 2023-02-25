package week1.day1;

public class Mobile
{
	String mobileBrandName ="Google Pixel";
	char mobileLogo='G';
	short noOfMobilePiece=20;
	int modelNumber=7382516;
	long mobileImeiNumber=1252405410;
	float mobilePrice=30999.65F;
	boolean isDamaged=false;
	public static void main(String[] args) 
	{
		Mobile mob=new Mobile();
		System.out.println(mob.mobileBrandName);
		System.out.println("Mobile logo ="+mob.mobileLogo);
		System.out.println("No. of mobile piece "+" ="+mob.noOfMobilePiece);
		System.out.println("Mobile IMEI number "+" ="+mob.mobileImeiNumber);
		System.out.println("Mobile price "+" ="+mob.mobilePrice);
		System.out.println("Damaged "+" ="+mob.isDamaged);
		
	}
}

