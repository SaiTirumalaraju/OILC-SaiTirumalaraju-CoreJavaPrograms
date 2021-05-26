
public class Factorial {

	public static void main(String[] args) 
	{
		try {
		System.out.println(factorial(Integer.parseInt(args[0])));
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

	private static String factorial(int n)
	{
		if(n>0) 
		{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		
		return ""+fact;
		}
		return ""+10/0;
	}

}
