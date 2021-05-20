import java.util.Scanner;

public class PrimeNumbersSum {

	public static void main(String[] args) 
	{
Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Range(Two Values): ");
		
		System.out.println("Sum of All Primes in range :"+getPrimeNumbersSum(s.nextInt(),s.nextInt()));
	}

	private static int getPrimeNumbersSum(int start, int end) 
	{
		int res=0;
		if(start >= end) {
			res=-3;
		}
		else {
		for(int i=start;i<=end;i++)
		{
			if (i < 0) {
				res=-1;
				break;
			}
			else if(i == 0 ) {
				res=-2;
				break;
			}
			else {
			if(isPrime(i)) {
				res+=i;
			}
			}
		}
		}
		return res;
	}
	
	 static boolean isPrime(int num) {
			int count = 0;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 0) {
				return true;
			} else {
				return false;
			}

	}

}
