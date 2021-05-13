
public class EvenOrOdd {

	public static void main(String[] args) 
	{
		try {
			int n=Integer.parseInt(args[0]);
			System.out.println(evorod(n));
			}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}

	private static String evorod(int n) {
		
		return (n%2==0)?"Even Number":"Odd Number";
	}

}
