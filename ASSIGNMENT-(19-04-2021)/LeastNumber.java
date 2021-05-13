
public class LeastNumber {

	public static void main(String[] args)
	{
		try {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int least=(a<b)?a:b;
			System.out.println(least);
			}
			catch(Exception e)
			{
				System.out.println("Error");
			}

	}

}
