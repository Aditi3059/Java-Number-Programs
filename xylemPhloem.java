package recursion;

import java.util.Scanner;

public class xylemPhloem {
	static Scanner userInput = new Scanner(System.in);
	static public int base = 1;
	public static void main(String[] args) {
		checkXylemOrPhloem();
	}
	
	public static int getNumber() {
		System.out.println("Enter a number to check: ");
		int number = userInput.nextInt();
		return number;
	}
	
	public static int countOfDigits(int number) {
		int count = 0;
		while(number>0) {
			number /= 10;
			count++;
		}
		return count;
	}
	
	public static int lastDigit(int number) {
		return number%10;
	}
	
	public static int firstDigit(int  number) {
		int count = countOfDigits(number);
		int firstdigit = 0;
		
		for(int i=1;i<count;i++) {
			base*=10;
		}
		firstdigit = number/base;
		return firstdigit;
	}
	
	public static int sumOfExtremes(int number) {
		int sum = 0;
		sum += lastDigit(number);
		sum += firstDigit(number);
		return sum;
	}
	
	public static int sumOfMiddle(int number) {
		int middledigits = 0;
		middledigits += firstDigit(number);
		middledigits *= base;
		middledigits = number - middledigits;
		middledigits /= 10;
		
		int sumofmiddle = 0;
		while(middledigits>0) {
			sumofmiddle += middledigits%10;
			middledigits /= 10;
		}
		return sumofmiddle;
	}
	
	public static void checkXylemOrPhloem() {
		int number = getNumber();
		int noOfDigits = countOfDigits(number);
		if(noOfDigits>2){
			int sumofextremes = sumOfExtremes(number);
			int sumofmiddle = sumOfMiddle(number);
			
			if(sumofextremes==sumofmiddle) {
				System.out.println(number+" is a Xylem");
			}
			else {
				System.out.println(number+" is a Phloem");
			}
		}
		else {
			System.out.println(number+" is not a Xylem nor Phloem");
		}
	}
	
}
