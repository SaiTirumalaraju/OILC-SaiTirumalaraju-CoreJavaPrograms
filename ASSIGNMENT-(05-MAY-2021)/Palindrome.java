import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a number:");
		System.out.println(isPalindrome(s.nextInt()));
	}

	private static int isPalindrome(int num) {
		int res = 0, n, temp = num;
		int count = 0;
		if (num <= 0) {
			return -1;
		} else {
			while (num > 0) {
				n = num % 10;
				res = res * 10 + n;
				num = num / 10;
				count++;
			}
			if (count != 3) {
				return -2;
			} else if (res == temp) {
				return 1;
			} else {
				return 0;
			}
		}
	}

}
