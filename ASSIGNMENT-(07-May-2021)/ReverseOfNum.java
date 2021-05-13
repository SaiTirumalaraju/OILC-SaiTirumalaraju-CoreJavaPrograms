/*5)Wap to display the reverse of the given number
123 -> 321
*/

import java.util.Scanner;

public class ReverseOfNum {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		System.out.println("Reverse of Number:"+reverseOfNum(s.nextInt()));
	}

	private static int reverseOfNum(int num) 
	{
		int rev=0,rem;
		
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}

}
