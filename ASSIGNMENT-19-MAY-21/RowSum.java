import java.util.*;
public class RowSum {
	static Scanner sc = new Scanner(System.in);
	static String getRowSum(int[][] arr) {
		int sum = 0;
		String result = "";
		
		if(arr.length != 3 || arr[0].length != 3) {
			result = null;
		}
		else {
			System.out.println("Enter values into array");
			for(int i = 0;i < arr.length;i++) {
				for(int j = 0;j < arr[i].length;j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println("Array elements are: ");
			for(int i = 0;i < arr.length;i++) {
				sum = 0;
				for(int j = 0;j < arr[i].length;j++) {
					System.out.print(arr[i][j] + " ");;
					sum += arr[i][j];

				}
				System.out.println();
				result += sum + " ";

			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter array size");
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		int[][] arr = new int[rows][columns];
		
		System.out.println("Rows values sum : \n" + getRowSum(arr));
	}

}
