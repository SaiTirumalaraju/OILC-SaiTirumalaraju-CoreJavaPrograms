
public class DigitChecker {

	public static void main(String[] args) 
	{
		int no=Integer.parseInt(args[0]);
		String res=diff(no);
		System.out.println(res);
	}

	private static String diff(int no) 
	{
		int farg=no%10;
		int sarg=no/10;
		return " "+ (Math.abs(sarg-farg));
	}

}
