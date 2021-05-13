
public class EvenNumberTester {

	public static void main(String[] args) {
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			if (n1 >= 0 && n2 >= 0) {
				if (n1 > n2)
				{
					n1 = n1 + n2;
					n2 = n1 - n2;
					n1 = n1 - n2;
				}
				for (int i = n1; i <= n2; i++) {
					if (isEven(i)) {
						System.out.print(i + " ");
					}
				}
			} else
				System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

	private static boolean isEven(int n) {
		if (n % 2 == 0)
			return true;
		return false;
	}

}
