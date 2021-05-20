import java.util.Scanner;

public class OddPalindrome {

	public static void main(String[] args) 
	{	
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter range(Two values):");
		
		System.out.println(getOddPalindromeList(s.nextInt(),s.nextInt()));
	}

	private static String getOddPalindromeList(int start, int end)
	{
		String res="";
		
		if(start>end) {
			res="Error";
		}
		else if(start <=0 || end <=0 ) {
			res="Error";
		}
		else if(start <100 ||  end>999) {
			res="Error";
		}
		else {
		for(int i=start;i<=end;i++) {
			if(isPalindrome(i)%2!=0) {
				res+=i+" ";
			}
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
