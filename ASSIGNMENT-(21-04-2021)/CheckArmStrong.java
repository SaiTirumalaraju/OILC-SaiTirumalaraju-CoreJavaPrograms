
public class CheckArmStrong {

	public static void main(String[] args) {
		try
		{
			System.out.println(amstrong(Integer.parseInt(args[0]), args[0].length()));
		} 
		catch (Exception e) 
		{
			System.out.println("Error");
		}

	}

	private static String amstrong(int n, int len)
	{
		int temp = n;
		int sum = 0;
		int n1;
		if (n > 0 && len==4)
		{
			while (n > 0) 
			{
				n1 = n % 10;
				sum += Math.pow(n1, len);
				n = n / 10;
			}
			if (sum == temp)
				return ("Amstrong Number");
			else
				return ("Not Astrong Number");
		}
		return "" + 10 / 0;
	}

}
