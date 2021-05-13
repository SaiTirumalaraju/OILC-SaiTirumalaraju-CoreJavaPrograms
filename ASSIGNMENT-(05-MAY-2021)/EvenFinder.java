import java.util.Scanner;

public class EvenFinder {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a number:");
		System.out.println(isEven(s.nextInt()));
	}

	private static int isEven(int num) 
	{
		int res=0;
		if (num <= 0) {
			res = -1;
		} else {
			if (num % 2 == 0) {
				res = 1;
			} else {
				res = 0;
			}
		}
		return res;
	}

}
