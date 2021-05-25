import java.util.*;
public class ColumnSum {
	static Scanner sc = new Scanner(System.in);
	static String getColumnSum(int[][] arr) {
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
					sum += arr[j][i];
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
		
		System.out.println("Column values sum : \n" + getColumnSum(arr));
	}
}
