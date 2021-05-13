
public class EvenFinder {

	public static void main(String[] args) 
	{
		try {
		int n=Integer.parseInt(args[0]);
		System.out.println(evenFind(n));
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
		
	}

	private static String evenFind(int n) 
	{
		return " "+(n%2==0);
	}

}
