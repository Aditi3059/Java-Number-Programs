package recursion;
import java.util.*;

public class SumProductofFactors {
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		factors(getNumber());

	}
	
	public static int getNumber() {
		System.out.println("Enter a number: ");
		int number = userInput.nextInt();
		return number;
	}
	
	public static void factors(int number) {
		int sum = 0;
		int product = 1;
		for(int i=1; i<=number; i++) {
			if(number%i==0) {
				System.out.println(i);
				sum+=i;
				product*=i;
			}
		}
		System.out.println("Sum of Factors: "+sum);
		System.out.println("Product of Factors: "+product);
	}
	
}
