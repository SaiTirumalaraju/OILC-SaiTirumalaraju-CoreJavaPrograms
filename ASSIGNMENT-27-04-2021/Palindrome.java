
public class Palindrome {

	public static void main(String[] args)
	{
		try {
			System.out.println(isPalindrome(Integer.parseInt(args[0])));
		}
		catch(Exception e) {
			System.out.println("Error");
		}
		
	}

	private static String isPalindrome(int n)
	{
		if(n>0) {
		if(checker(n))
			return ("true");
		else
			return ("false");
		}
		
		return ""+10/0;
	}

	private static boolean checker(int n)
	{
		int n1=0;
		int res=0;
		int temp=n;
		while(n>0) {
			n1=n%10;
			res=res*10+n1;
			n=n/10;
		}
		if(res==temp) {
			return true;
		}
		return false;
	}

}
