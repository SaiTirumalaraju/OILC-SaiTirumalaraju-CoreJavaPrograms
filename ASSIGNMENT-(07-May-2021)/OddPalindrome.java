//8)Wap to display odd palindrome numbers in the given range?

import java.util.Scanner;

public class OddPalindrome {

	public static void main(String[] args) 
	{	
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter range(Two values):");
		
		System.out.println(getOddPalindrome(s.nextInt(),s.nextInt()));
	}

	private static String getOddPalindrome(int start, int end)
	{
		String res="";
		
		for(int i=start;i<=end;i++) {
			if(isPalindrome(i)%2!=0) {
				res+=i+" ";
			}
		}
		return res;
	}
	static int isPalindrome(int num)
	{
		int rem,temp=num,res=0;
		while(num>0) {
			rem=num%10;
			res=res*10+rem;
			num=num/10;
		}
		if(res==temp) {
			return temp;
		}
		else {
			return 0;
		}
	}

}
