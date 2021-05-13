/*
10)Wap to find number of digits in the given number
123 - 3
12 ->2
 */

import java.util.Scanner;

public class CountOfDigits {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a NUmber:");
		
		System.out.println("No.Of Digits In Number:"+getDigitCount(s.nextInt()));
	}

	private static int getDigitCount(int num)
	{
		int rem,count=0;
		while(num>0) {
			rem=num%10;
			count++;
			num=num/10;
		}
		return count;
	}

}
