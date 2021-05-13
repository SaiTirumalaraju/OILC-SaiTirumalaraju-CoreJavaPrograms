import java.util.Scanner;

public class FindSmallest_Array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int arr[] = new int[10];

		System.out.println("Enter 10 values into Array:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}

		System.out.println("Largest value in Array:" + findSmallest(arr));
	}

	private static int findSmallest(int[] arr) {
		int small = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (small > arr[i]) {
				small = arr[i];
			}
		}
		return small;
	}

}
