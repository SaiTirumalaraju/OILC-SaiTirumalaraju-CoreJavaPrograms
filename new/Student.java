import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter 5 Subject marks:");

		int m1 = s.nextInt();
		int m2 = s.nextInt();
		int m3 = s.nextInt();
		int m4 = s.nextInt();
		int m5 = s.nextInt();

		String res = "";

		if (m1 >= 35 && m2 >= 35 && m3 >= 35 && m4 >= 35 && m5 >= 35) {
			int total = (m1 + m2 + m3 + m4 + m5);
			res += "Total:" + total + "\n";
			float avg = total / 5;
			res += "Average:" + avg + "\n";

			if (avg >= 75) {
				res += "Passed in Distinction\n";
			} else if (avg > 65) {
				res += "Passed in First Class\n";
			} else if (avg > 50) {
				res += "Passed in Second Class\n";
			} else {
				res += "Passed in Third Class\n";
			}

		} else {
			res += "You are failed, Please try Again!";
		}

		System.out.println(res);

	}

}
