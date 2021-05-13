import java.util.Scanner;

public class ListOfAmstrong {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter range(Two Values):");

		System.out.println(listAmstrong(s.nextInt(), s.nextInt()));
	}

	private static String listAmstrong(int start, int end) {
		String res = "";

		for (int i = start; i <= end; i++) {
			if (isAmstrong(i)) {
				res += " " + i;
			}
		}
		return res;
	}

	private static boolean isAmstrong(int num) {
		int temp = num;
		int len = len(num);
		int sum = 0;
		int rem;
		while (num > 0) {
			rem = num % 10;
			sum += Math.pow(rem, len);
			num = num / 10;
		}
		if (sum == temp)
			return true;
		else
			return false;
	}

	private static int len(int n) {
		int rem, len = 0;
		while (n > 0) {
			rem = n % 10;
			len++;
			n = n / 10;
		}
		return len;
	}

}
