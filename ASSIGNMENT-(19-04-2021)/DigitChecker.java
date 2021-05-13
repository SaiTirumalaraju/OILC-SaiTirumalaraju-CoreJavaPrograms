
public class DigitChecker {

	public static void main(String[] args) 
	{
		int no=Integer.parseInt(args[0]);
		int farg=no%10;
		int sarg=no/10;
		int res=Math.abs(sarg-farg);
		System.out.println(res);
	}

}
