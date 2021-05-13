import java.util.Scanner;

public class Rounder {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a number:");
		System.out.println(calculate(s.nextInt()));
	}

	private static int calculate(int num) {
		int res = 0;
		if (num <= 0) {
			res = -1;
		} else if (num % 2 == 0) {
			res = num * num;
		} else {
			res = num * num * num;
		}
		return res;

	}

}
