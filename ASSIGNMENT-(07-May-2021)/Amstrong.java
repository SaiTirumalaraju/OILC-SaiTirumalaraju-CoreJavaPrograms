/*9)Wap to check whether the given nubmer is amstrong number or not?
153 -> 1*1*1 + 5*5*5+ 3*3*3 */

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		
		System.out.println(isAmstrong(s.nextInt()));
	}

	static String isAmstrong(int num) 
	{
		int temp = num;
		int len=len(num);
		int sum = 0;
		int rem;
			while (num > 0) {
				rem = num % 10;
				sum += Math.pow(rem, len);
				num = num / 10;
			}
			if (sum == temp)
				return ("Amstrong Number");
			else
				return ("Not Astrong Number");
		
	}

	private static int len(int n) 
	{
		int rem,len=0;
		while(n>0) {
			rem=n%10;
			len++;
			n=n/10;
		}
		return len;
	}

}
