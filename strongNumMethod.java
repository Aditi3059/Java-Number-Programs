package recursion;

import java.util.Scanner;

public class strongNumMethod {
	
	static Scanner userInput=new Scanner(System.in);
	public static void main(String[] args) {
	
		checkifStrong();
		
	}

	public static int getNumber() {
		System.out.println("Enter a number to check: ");
		int number = userInput.nextInt();
		return number;
	}
	
	public static int fetchlastdigit(int number) {
		return number%10; 
	}
	
	public static int eliminatelastdigit(int number) {
		return number/10; 
	}
	
	public static int factorial(int number) {
		int factorial = 1;
		for(int i=1; i<=number; i++) {
			factorial *= i;
		}
		return factorial;
	}

	public static void checkifStrong() {
		int number = getNumber();
		int temp = number;
		int sum = 0;
		while(temp>0) {
			int digit = fetchlastdigit(temp);
			int factorial = factorial(digit);
			sum += factorial;
			temp = eliminatelastdigit(temp);
		}
		if(number == sum) {
			System.out.println(number+" is a strong number.");
		}
		else {
			System.out.println(number+" is not a strong number.");	
		}
	}
}
