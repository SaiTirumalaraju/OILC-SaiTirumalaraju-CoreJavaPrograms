import java.util.Scanner;

public class FizzBizz {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		
		System.out.println(getOutputString(s.nextInt()));
		
	}

	private static String getOutputString(int n) 
	{
		if(n>0) {
		if (n % 3 == 0 && n % 5 == 0)
			return "FIZZBIZZ";
		else if (n % 5 == 0)
			return "BIZZ";
		else if (n % 3 == 0)
			return "FIZZ";
		else
			return "" + n;
		}
		else {
			return "Error";
		}
	}

}
