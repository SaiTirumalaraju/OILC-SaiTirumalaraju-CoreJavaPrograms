import java.util.Scanner;

public class FindEven_Array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int arr[] = new int[10];

		System.out.println("Enter 10 values into a array:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}

		System.out.println("Even numbers:" + findEven(arr));
	}

	private static String findEven(int[] arr) {
		String res = "";

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				res += " " + arr[i];
			}
		}
		return res;
	}
}
