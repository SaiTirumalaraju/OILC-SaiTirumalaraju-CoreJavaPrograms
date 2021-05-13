import java.util.Scanner;

public class OddRounder {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a number:");
		System.out.println(oddRounder(s.nextInt()));
	}

	private static int oddRounder(int num) {
		int res = 0;
		if (num < 0) {
			res = -1;
		} else if (num == 0) {
			res = -2;
		} else {
			if (num % 2 == 0) {
				res = num;
			} else {
				res = ((num + 9) / 10) * 10;
			}
		}
		return res;
	}

}
