
public class EvenOrOdd {

	public static void main(String[] args) 
	{
		try {
			int n=Integer.parseInt(args[0]);
			
			String res=(n%2==0)?"Even Number":"Odd Number";
			
			System.out.println(res);
			}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}

}
