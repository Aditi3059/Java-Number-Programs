package recursion;

import java.util.Scanner;

public class spyNumber {
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		int number = getnumber();
		checkifSpy(number);
		
	}
	
	public static int getnumber() {
		System.out.println("Enter a number to check: ");
		int number = userInput.nextInt();
		return number;
	}
	
	public static void checkifSpy(int number) {
		int temp = number;
		int sum = 0;
		int product = 1;
		while(temp>0) {
			sum += temp%10;
			product *= temp%10;
			temp /= 10;
		}
		if(sum==product) {
			System.out.println(number+ " is a spy number");
		}
		else {
			System.out.println(number+ " is a not a spy number");
		}
	}

}
