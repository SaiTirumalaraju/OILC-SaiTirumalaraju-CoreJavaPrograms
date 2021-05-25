import java.util.*;
public class DiagonalSum {
	static Scanner sc = new Scanner(System.in);
	static String getDiagonalSum(int[][] arr) {
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
			for(int i = 0;i < arr.length;i++) 
			{
				for(int j = 0;j < arr[i].length;j++) 
				{
					if(i == j)
					{
						sum += arr[i][j];
					System.out.print(arr[i][j] + " ");;
					}
					else {
						System.out.print(arr[i][j] + " ");;
					}
				}
				System.out.println();
			}
			
			result += sum + " ";

		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter array size");
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		int[][] arr = new int[rows][columns];
		
		System.out.println("Diagonal Values  sum : \n" + getDiagonalSum(arr));
	}
}
