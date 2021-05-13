import java.util.Scanner;

public class FindBiggest_Array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int arr[] = new int[10];

		System.out.println("Enter 10 values into Array:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}

		System.out.println("Largest value in Array:" + findBiggest(arr));
	}

	private static int findBiggest(int[] arr) {
		int big = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (big < arr[i]) {
				big = arr[i];
			}
		}
		return big;
	}

}
