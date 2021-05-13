import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a Number:");

		System.out.println(checkPrime(s.nextInt()));
	}

	private static String checkPrime(int num) {
		String res = "";

		if (num < 0) {
			res = "" + -1;
		} else if (num == 0 || num == 1) {
			res = "" + -2;
		} else {
			if (isPrime(num)) {
				res = "True";
			} else {
				res = "False";
			}
		}
		return res;
	}

	private static boolean isPrime(int num) {
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}

}
