package recursion;
import java.util.*;
public class technumber {
       static Scanner userInput=new Scanner(System.in);
	public static void main(String[] args) {
		//capture userInput
		System.out.print("Enter a number : ");
		int Originalnum = userInput.nextInt();
		//count no.of digits
		int temp=Originalnum;
		int noofdigits=0;
		while(temp>0) {
			temp/=10;;
			noofdigits++;
		}
		//if odd give the o/p, if even proceed 
		if(noofdigits%2!=0) {
			System.out.println("It is not a Tech number.");
		}else {
			//split the number in two equal parts 
			int split=noofdigits/2;
			int power=split;
			int base=10;
			int splitfactor=1;
			for(int i=1;i<=power;i++) {
				splitfactor*=base;
			}
			//endsplit
			int tempforendsplit=Originalnum;
			int endsplit=tempforendsplit%splitfactor;
			//startsplit
			int tempforstartsplit=Originalnum;
			int startsplit=tempforstartsplit/splitfactor;
			//sum the 2 parts 
			int sum=startsplit+endsplit;
			//square the sum 
			int result=sum*sum;
			//compare sum to originalnumber
			if(result==Originalnum) {
				System.out.println(Originalnum+" is a tech number.");
			}	
			else {
				System.out.println("It is not a Tech number.");
			}
		}
	}
}
