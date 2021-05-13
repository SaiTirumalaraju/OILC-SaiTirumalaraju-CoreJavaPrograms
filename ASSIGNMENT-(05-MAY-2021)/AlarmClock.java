import java.util.Scanner;

public class AlarmClock {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter a day value and Boolean value");
		int day = s.nextInt();
		String val = s.next();

		String res = ringAlarm(day, val);
		System.out.println(res);

	}

	private static String ringAlarm(int day, String val) {
		String res = "";
		if ((day >= 0 && day <= 6) && (val.equals("true") || val.equals("false"))) 
		{
			if ((day > 0 && day < 6) && (val.equals("true"))) {
				res = " " + ("10:00");
			} else if ((day > 0 && day < 6) && (val.equals("false"))) {
				res = " " + ("7:00");
			} else if ((day == 0 || day == 6) && (val.equals("true"))) {
				res = "OFF";
			} else if ((day == 0 || day == 6) && (val.equals("false"))){
				res = " " + ("10:00");
			}

		}

		else {
			res = " Invalid Inputs";
		}
		return res;
	}
}
