
public class SignFinder {

	public static void main(String[] args)
	{
		try {
		int n=Integer.parseInt(args[0]);
		System.out.println(sign(n));
		}
		catch(Exception e){
			System.out.println("Error");
		}
	}

	private static String sign(int n)
	{
		return (n>0)?"positive number":((n<0)?"negative Number":"Zero");
	}

}
