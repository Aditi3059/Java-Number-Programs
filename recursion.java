package recursion;

public class recursion {

	public static void main(String [] args) {
		starPrinter(4);
	}
	
	
	public static void starPrinter(int countofStar) {
		System.out.println("*");
		--countofStar;
		if(countofStar>0)
		{
		 starPrinter(countofStar);
		}
	
}
	
//	public static void starPrinter(int countofStar) {
//		System.out.println("*");
//		--countofStar;
//		if(countofStar==0) {
//			return;
//		}
//		starPrinter(countofStar);
//	}
}
