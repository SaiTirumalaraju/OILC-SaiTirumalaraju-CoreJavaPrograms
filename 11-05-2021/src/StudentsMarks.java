
/*1.Wap accept 5 sub marks into an array. 
 * If student cleared all subjects then you calculate
total,avg,grade otherwise simply display failed?

    int marks[] = new int[5];
   >= 35
  void dispMarks(int marks[]){
  }   
  boolean isPass(int marks[] ){
  }
  int calTotal(){
      total
  }
  String findGrade() {
  }*/
import java.util.Scanner;

public class StudentsMarks {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int marks[] = new int[5];

		System.out.println("Enter" + marks.length + " values into Array:");

		for (int i = 0; i < marks.length; i++) {
			marks[i] = s.nextInt();
		}

		if (isPass(marks)) {
			System.out.println("Marks:" + (dispMarks(marks)));
			int total = calTotal(marks);
			float avg = total / marks.length;
			System.out.println("Total: " + total + "\nAverage: " + avg);
			System.out.println(findGrade(avg));
		} else {
			System.out.println("Failed! Please Try Again NextTime");
		}
	}

	private static String findGrade(float avg) {
		String grade = "";

		if (avg >= 75) {
			grade = "Passed In Distinction \n";
		} else if (avg >= 65) {
			grade = "Passed In FirstClass \n";
		} else if (avg >= 55) {
			grade = "Passed in Second Class \n";
		} else {
			grade = "Passed in Third Class\n";
		}
		return grade;
	}

	private static int calTotal(int[] marks) {
		int total = 0;
		for (int i = 0; i < marks.length; i++) {
			total += marks[i];
		}
		return total;
	}

	private static String dispMarks(int[] marks) {
		String res = "";
		for (int i = 0; i < marks.length; i++) {
			res += " " + marks[i];
		}
		return res;
	}

	private static boolean isPass(int[] marks) {
		boolean b = false;
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] >= 35) {
				b = true;
			} else {
				b = false;
			}
		}
		return b;
	}

}
