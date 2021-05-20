import java.util.Scanner;

public class CollatzSequence {

	public static void main(String[] args) {

		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		n = s.nextInt();

		System.out.println(getSequence(n));

	}

	private static String getSequence(int n) {
		if (n > 0) {
			String str = "";
			str = str + "" + n;
			int count = 0;
			while (n > 1) {
				if (n % 2 == 0) {
					n = n / 2;
				} else {
					n = (3 * n) + 1;
				}
				count++;
				str = str + " " + n;
			}
			if (count < 100) {
				return str;
			} else {
				return "Doesnot Conerge";
			}
		} else {
			return "Error";
		}
	}

}
