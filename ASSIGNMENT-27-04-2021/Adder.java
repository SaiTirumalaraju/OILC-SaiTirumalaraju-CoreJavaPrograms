
public class Adder {

	public static void main(String[] args) {
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);

			System.out.println(getSum(n1, n2));
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

	private static String getSum(int n1, int n2) {
		if (n1 > 0 && n2 > 0)
			return "" + (n1 + n2);

		return "" + 10 / 0;
	}

}
