package recursion;
import java.util.*;
public class rangearmstrong {
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
        System.out.print("Enter Start of range  : ");
        int start = userInput.nextInt();
        userInput.nextLine();
        System.out.print("Enter End of range  : ");
        int end = userInput.nextInt();
        for(int i=start;i<=end;i++) {
        	int originalNum=i;
        int pow = countNoOfDigits(originalNum);
        int sum = sumCalculator(originalNum, pow);
        if (verifyArmstrong(originalNum, sum)) {
            System.out.println(originalNum );
        } 
        }
    }

    public static int countNoOfDigits(int number) {
        int noOfDigits = 0;
        while (number > 0) {
//            number /= 10;
            number = eliminateLastDigit(number);
            noOfDigits++;
        }
        return noOfDigits;
    }

    public static int fetchLastDigit(int number) {
        return number %= 10;
    }

    public static int eliminateLastDigit(int number) {
        return number /= 10;
    }

    public static int sumCalculator(int number, int pow) {
        int sum = 0;
        while (number > 0) {
            int lastDigit = fetchLastDigit(number);
            number = eliminateLastDigit(number);
            int powerCalculation = powCalculator(lastDigit, pow);
            sum += powerCalculation;
        }
        return sum;
    }

    public static int powCalculator(int base, int pow) {
        int output = 1;
        while (pow > 0) {
            output = output * base;
            pow--;
        }
        return output;
    }

    public static boolean verifyArmstrong(int number, int sum) {
        if (number == sum) {
            return true;
        }
        return false;
    }


	}


