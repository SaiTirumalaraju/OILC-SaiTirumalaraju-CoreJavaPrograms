import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a number:");
		System.out.println(isEvenOrOdd(s.nextInt()));
	}

	private static String isEvenOrOdd(int num) {
		String res = "";

		if (num <= 0) {
			res = "Invalid Input";
		} else if (num % 2 == 0) {
			res = "Even";
		} else {
			res = "Odd";
		}
		return res;
	}

}
