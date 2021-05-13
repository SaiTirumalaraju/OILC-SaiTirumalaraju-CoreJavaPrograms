import java.util.Scanner;

public class CollatzSequence {

	public static void main(String[] args) {
		try {
			int n;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a number:");
			n = s.nextInt();
			if (n > 0) {
				System.out.println(getSequence(n));
			} else {
				System.out.println(10 / 0);
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

	private static String getSequence(int n) {
		String str = "";
		str = str + "" + n;
		while (n > 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = (3 * n) + 1;
			}
			str = str + " " + n;
		}
		return str;

	}

}
