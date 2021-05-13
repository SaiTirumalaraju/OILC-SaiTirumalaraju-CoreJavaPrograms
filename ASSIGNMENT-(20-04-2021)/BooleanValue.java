
public class BooleanValue {

	public static void main(String[] args) {
		String s[] = new String[args.length];
		Boolean[] b = new Boolean[s.length];
		try
		{
			for (int i = 0; i < s.length; i++)
			{
				s[i] = args[i];
				if ((s[i].equals("true")) || (s[i].equals("false")))
				{
					b[i] = Boolean.parseBoolean(s[i]);
				} 
				else
					System.out.println(10 / 0);
			}
			System.out.println(check(b,s));
		} 
		catch (Exception e) {
			System.out.println("Error");
		}
	}

	private static String check(Boolean[] b, String[] s)
	{
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			if (b[i])
			{
				count++;
			}
		}
		if (count >= 2)
			return " "+("true");
		else
			return " "+("false");
	}
}
