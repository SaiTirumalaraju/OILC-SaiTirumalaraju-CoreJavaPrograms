import java.util.Scanner;

public class ListPrimes {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Range(Two Values): ");
		
		System.out.println(getPrimeNumbers(s.nextInt(),s.nextInt()));
	}

	private static String getPrimeNumbers(int start, int end) 
	{
		String res="";
		if(start >= end) {
			res=""+-2;
		}
		else {
		for(int i=start;i<=end;i++)
		{
			if (i < 0) {
				res=""+-1;
				break;
			}
			else {
			if(isPrime(i)) {
				res+=i+" ";
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
