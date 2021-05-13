import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a Number:");

		System.out.println(checkPalindrome(s.nextInt()));
	}

	private static String checkPalindrome(int num) 
	{
		String res="";
		if (num < 0) 
		{
			res = "" + -1;
		} else if (num == 0 || num <= 9) 
		{
			res = "" + -2;
		} 
		else 
		{
			if (isPalindrome(num)) {
				res="True";
			}
			else {
				res="False";
			}
		}
		return res;
	}

	private static boolean isPalindrome(int num)
	{
		int rem,temp=num,res=0;
		while(num>0) {
			rem=num%10;
			res=res*10+rem;
			num=num/10;
		}
		if(res==temp) {
			return true;
		}
		else {
			return false;
		}
	}

}
