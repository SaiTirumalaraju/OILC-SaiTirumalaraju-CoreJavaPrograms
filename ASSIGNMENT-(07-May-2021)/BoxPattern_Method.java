import java.util.Scanner;

public class BoxPattern_Method {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter rows value and column value:");

		System.out.println(createBoxPattern(s.nextInt(), s.nextInt()));
	}

	private static String createBoxPattern(int rows, int cols) {
		String res = "";

		if (rows < 0 || cols < 0) {
			res = "" + -1;
		} else if (rows == 0 || cols == 0) {
			res = "" + -2;
		} else {
			for (int i = 1; i <= rows; i++) {
				for (int j = 1; j <= cols; j++) {
					if (i == 1 || i == rows) {
						res += " * ";
					} else if (j == 1 || j == cols) {
						res += " * ";
					} else {
						res += "   ";
					}
				}
				res += "\n";
			}
		}

		return res;
	}

}
