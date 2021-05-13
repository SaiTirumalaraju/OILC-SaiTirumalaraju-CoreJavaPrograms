import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a number:");
		System.out.println(SumOfDigits(s.nextInt()));
	}

	private static int SumOfDigits(int num)
	{
		int res=0;
		if (num > 10 && num < 99) {
			res = num % 10 + num / 10;
		} else if (num < 0) {
			res = -3;
		} else if (num > 99) {
			res = -2;
		} else {
			res = -1;
		}
		return res;
	}

}
