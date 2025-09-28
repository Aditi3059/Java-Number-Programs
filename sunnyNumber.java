package recursion;
import java.util.*;

public class sunnyNumber {
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		checkSunnyNumber();

	}

	public static int getNumber() {
		System.out.println("Enter a number to check: ");
		int number = userInput.nextInt();
		return number;
	}
	
	public static int add1(int number) {
		return number+1;
	}
	
	public static boolean checkperfectsquare(int number) {
		boolean isPerfectSquare = false;
		
		for(int i=1;i<number/2;i++) {
			int product = i*i;
			if(product==number) {
				isPerfectSquare = true;
				break;
			}
		}
		return isPerfectSquare;
	}
	
	public static void checkSunnyNumber() {
		int Originalnumber = getNumber();
		int digittocheck = add1(Originalnumber);
		boolean check = checkperfectsquare(digittocheck);
		if(check) {
			System.out.println(Originalnumber+" is a sunny number");
		}
		else {
			System.out.println(Originalnumber+" is not a sunny number");
		}
	}
}
