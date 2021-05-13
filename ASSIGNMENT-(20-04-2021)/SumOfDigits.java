class SumOfDigits {
	public static void main(String args[])
	{
		int no = Integer.parseInt(args[0]);
		String s = sum(no);
		System.out.println(s);
	}

	private static String sum(int no)
	{
		int farg = no % 10;
		int sarg = no / 10;
		return " "+(farg+sarg);
	}
}