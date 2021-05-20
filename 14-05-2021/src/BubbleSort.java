import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int arr[] = new int[10];

		System.out.println(" Enter " + arr.length + " Value into an Array:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}

		int res[] = bubbleSort(arr);
		System.out.println("After Sorting:");
		for(int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}

	}

	private static int[] bubbleSort(int[] arr) 
	{
		int temp,len = arr.length;
		for (int i = 0; i < len; i++) 
		{
			for(int j = 0; j < len-i-1; j++) {
				if( arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		return arr;
	}

}
