
public class LeastNumber {

	public static void main(String[] args)
	{
		try {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			System.out.println(least(a,b));
			}
			catch(Exception e)
			{
				System.out.println("Error");
			}

	}
	private static String least(int a, int b) {
		return " "+((a<b)?a:b);
	}

}
