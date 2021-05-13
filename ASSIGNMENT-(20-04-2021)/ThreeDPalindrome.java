
public class ThreeDPalindrome {

	public static void main(String[] args) 
	{
		String s1=args[0];
		System.out.println(palindrome(s1));
	}

	private static String palindrome(String s1) 
	{
		String s2="";
		s2=s2+s1.charAt(2)+s1.charAt(1)+s1.charAt(0);
		return " "+s1.equals(s2);
	}

}
