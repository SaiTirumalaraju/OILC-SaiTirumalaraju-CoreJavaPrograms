import java.util.Scanner;

public class LeastNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter two  numbers:");
		System.out.println(getLeastNum(s.nextInt(), s.nextInt()));
	}

	private static int getLeastNum(int num1, int num2)
	{
		int res=0;
		if (num1 < 0 || num2 < 0) {
			res = -1;
		} else if (num1 == 0 || num2 == 0) {
			res = -2;
		} else {
			res = (num1 > num2 ? num2 : num1);
		}
		return res;
	}

}
