
/*2)Wap insert element at some location in the array?
  10 11 12 14 15
 loc = 2*/

import java.util.Scanner;

public class InsertElementLoc {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter size of Array:");
		int size = s.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter " + arr.length + " Values into Array:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}

		System.out.println("Enter a Insertion value:");
		int value = s.nextInt();

		System.out.println("Enter location to Insert:");
		int location = s.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (i == location) {
				arr[i] = value;
			}
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
