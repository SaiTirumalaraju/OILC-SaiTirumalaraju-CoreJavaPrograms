import java.util.Scanner;

public class DaysinMonth_using_switch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a Month in 3 starting Characters:");

		String month = s.next().toUpperCase();

		String res = "";

		switch (month) {

			case "JAN":
			case "MAR":
			case "MAY":
			case "JUL":
			case "AUG":
			case "OCT":
			case "DEC":
				res = month + " has 31 Days";
				break;
			case "APR":
			case "JUN":
			case "SEP":
			case "NOV":
				res = month + " has 30 Days";
				break;
	
			case "FEB":
				res = month + " has 28 Days";
				break;
			default:
				res = "Not a Valid Month";
				break;

		}

		System.out.println(res);
	}

}
