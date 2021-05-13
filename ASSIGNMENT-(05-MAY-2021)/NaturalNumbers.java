import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter two numbers");

		System.out.println(getNaturalNumbers(s.nextInt(), s.nextInt()));
	}

	private static String getNaturalNumbers(int num1, int num2) {
		String res = " ";
		if (num1 < 0 && num2 < 0) {
			res = "" + -1;
		} else if (num1 == 0 && num2 == 0) {
			res = "" + -2;
		} else {

			int i = num1;
			while (i <= num2) {
				res = res+ i + " ";
				i++;
			}
		}
			return res;
	}

}
