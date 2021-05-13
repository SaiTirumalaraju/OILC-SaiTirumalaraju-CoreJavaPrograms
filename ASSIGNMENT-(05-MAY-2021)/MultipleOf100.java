import java.util.Scanner;

public class MultipleOf100 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter a number:");
		System.out.println(getNextMultipleOf100(s.nextInt()));
	}

	private static int getNextMultipleOf100(int num) 
	{
		int res=0;
		if (num <= 0) {
			res = -1;
		} else {
			res = (((num + 99) / 100) * 100);
		}
		return res;
	}

}
