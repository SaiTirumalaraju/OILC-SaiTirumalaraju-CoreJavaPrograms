import java.util.Scanner;

public class RoundedSum {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Three numbers:");
		System.out.println(sumOfRoundedValues(s.nextInt(),s.nextInt(),s.nextInt()));
	}

	private static int sumOfRoundedValues(int num1, int num2, int num3)
	{
		 int sum=0;
		 if (num1 <= 0 && num2 <= 0 && num3 <= 0) {
				sum = -1;
			} else {
				sum = round(num1) + round(num2) + round(num3);
			}
			return sum;
		
	}

	private static int round(int num) {
		if(num%10 < 5) {
			return ((num) / 10) * 10;
		}
		else {
		return ((num + 9) / 10) * 10;
		}
	}

}
