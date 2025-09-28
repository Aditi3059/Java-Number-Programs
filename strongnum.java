package recursion;

import java.util.Scanner;

public class strongnum {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner userInput = new Scanner(System.in);
		int number=userInput.nextInt();
	    
		int Originalnum= number ;
		int sum=0;
		
		while(number>0) {
			int digit = number%10;
			sum += factorial(digit);
			number=number/10;
		}
        if(Originalnum==sum) {
        	System.out.println(Originalnum+" is a strong number.");
        }else {
        	System.out.println(Originalnum+" is not a strong number.");

        }
	}
	public static int factorial(int n) {
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact *= i;
		}
		return fact;
	}
	
	

}
