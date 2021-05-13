
public class Prime {

	public static void main(String[] args) {
		try {
			int n = Integer.parseInt(args[0]);
			if (n > 0) {
				System.out.println(isPrime(n));
			} else
				System.out.println(10 / 0);

		} catch (Exception e) {
			System.out.println("Error");
		}
	}

	private static boolean isPrime(int n) {
		int count=0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if(count==2)
			return true;
		return false;
	}
}
