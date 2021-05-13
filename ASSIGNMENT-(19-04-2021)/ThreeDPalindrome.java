
public class ThreeDPalindrome {

	public static void main(String[] args) 
	{
		String s1=args[0];
		int fn=s1.charAt(0);
		int sn=s1.charAt(1);
		int tn=s1.charAt(2);
		String s2="";
		s2=s2+s1.charAt(2)+s1.charAt(1)+s1.charAt(0);
		System.out.println(s1.equals(s2));
	}

}
