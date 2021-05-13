//3)Wap to find sum of factors of the given number?

import java.util.Scanner;

public class SumOfFactors {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a number:");

		System.out.println("Sum Of Factors:" + sumofFactors(s.nextInt()));
	}

	private static int sumofFactors(int num)
	{
		int res=0;
		
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				res += i;
			}
		}
		
		return res;
	}

}
