
public class GreatestNumber {

	public static void main(String[] args) 
	{
		try {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			System.out.println(large(a,b));
			}
			catch(Exception e)
			{
				System.out.println("Error");
			}
	}

	private static String large(int a, int b)
	{
		return " "+((a>b)?a:b);	
	}

}
