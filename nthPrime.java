
public class nthPrime {
	public static void main(String[] args) {
		mthPrime(6);
	}

		
	public static void mthPrime(int n) {
	int count = 0;
	int mthprime = 0;	
	for(int i = 1; count<n; i++) {
		int countforprime = 0;
		for (int j = 1;j<=i; j++) {
			if(i%j==0) {
				countforprime++;
			}
			}
		if(countforprime==2) {
			mthprime = i;
			count++;
		}
	}
}
}