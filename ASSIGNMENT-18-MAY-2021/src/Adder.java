import java.util.Scanner;

public class Adder {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Two Numbers:");
		System.out.println("Sum:"+getSum(s.nextInt(),s.nextInt()));
	}

	private static String getSum(int num1, int num2)
	{
		String res="";
		if(num1<=0 || num2 <= 0) {
			res="Error";
		}
		else {
			res=""+(num1+num2);
		}
		return res;
	}

}
