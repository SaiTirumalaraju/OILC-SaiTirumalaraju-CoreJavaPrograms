import java.util.Scanner;

public class OddCounter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a[] = new int[10];
		System.out.println("Enter " + a.length + " values into Array");

		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}

		System.out.println(getOddCount(a));

	}

	private static String getOddCount(int[] a) {
		String res = "";
		if (a == null) {
			res = "" + -4;
		} else {
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] <= 0) {
					res = "" + -2;
					break;
				}

				else {
					if (a[i] % 2 != 0) {
						count++;
					}
				}
			}
			if (count == 0) {
				res = "" + -3;
			} else {
				res = "" + count;
			}
		}
		return res;
	}

}
