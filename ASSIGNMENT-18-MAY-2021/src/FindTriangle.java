import java.util.Scanner;

public class FindTriangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter length of Three Sides Of a Triangle ");

		System.out.println(findTrianlge(s.nextInt(), s.nextInt(), s.nextInt()));
	}

	private static String findTrianlge(int val1, int val2, int val3) {
		if (val1 == 0 && val2 == 0 && val3 == 0) {
			return "" + -1;
		} else if (val1 < 0 && val2 < 0 && val3 < 0) {
			return "" + -2;
		} else if (sum(val1, val2) <= val3 || sum(val1, val3) <= val2 || sum(val2, val3) <= val1) {
			return "" + -3;
		}
		else {
			 if(val1 == val2 && val2 == val3 && val1 == val3) {
				return "Equilateral TRIANGLE";
			}
			else if(val1 == val2 || val2 == val3 || val1 == val3){
				return "Isosceles Triangle";
			}
			else {
				return "SCALENE TRIANGLE";
			}
		}

	}

	private static int sum(int val1, int val2) {
		return val1 + val2;
	}

}
