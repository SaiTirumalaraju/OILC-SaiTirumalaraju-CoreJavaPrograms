class SumOfDigits {
	public static void main(String args[])
	{
		int sum = 0;
		int no = Integer.parseInt(args[0]);
		int farg = no % 10;
		int sarg = no / 10;
		sum = farg + sarg;
		System.out.println(sum);
	}
}