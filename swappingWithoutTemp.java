package recursion;

import java.util.Scanner;

public class swappingWithoutTemp {
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter 2 numbers to swap: ");
		int a = userInput.nextInt();
		int b = userInput.nextInt();
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		swapNumbers(a,b);

	}
	
	public static int swapNumbers(int a, int b) {
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swapping: ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		return 0;
	}

}
