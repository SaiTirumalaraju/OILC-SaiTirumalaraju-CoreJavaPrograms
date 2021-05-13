
public class EvenFinder {

	public static void main(String[] args) 
	{
		try {
		int n=Integer.parseInt(args[0]);
		System.out.println(n%2==0);
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
		
	}

}
