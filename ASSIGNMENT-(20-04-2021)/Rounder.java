
public class Rounder {

	public static void main(String[] args) {

		try {
			int n = Integer.parseInt(args[0]);
			System.out.println(round(n));
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

	private static String round(int n) {

		// 		44 					(44+9=53; 53/10=5; 5*10=50)
		return n > 0 ? (String.valueOf((n % 2 != 0) ? n : (((n + 9) / 10) * 10))) : "Error";

	}

}
