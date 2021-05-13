/*
2.Wap to display factors of the given number
      6 -> 1 2 3
 */
import java.util.Scanner;

public class DisplayFactors {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a number:");

		System.out.println("Factors:" + getFactors(s.nextInt()));
	}

	private static String getFactors(int num) {
		String res = "";

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				res += i + " ";
			}
		}
		return res;
	}

}
