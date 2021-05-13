import java.util.Scanner;

public class SignFinder {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a number:");
		System.out.println(findSign(s.nextInt()));
	}

	private static int findSign(int num) {
		int res = 0;

		if (num < 0) {
			res = -1;
		} else if (num == 0) {
			res = 0;
		} else {
			res = 1;
		}
		return res;
	}

}
