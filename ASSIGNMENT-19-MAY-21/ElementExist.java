import java.util.*;
public class ElementExist {
	static Scanner sc = new Scanner(System.in);
	static boolean isElementExist(int[][] arr) {
		boolean b = false;
		System.out.println("Enter values into array");
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Array elements are: ");
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");;
			}
			System.out.println();
		}
		
		System.out.println("Enter Searching element: ");
		int find = sc.nextInt();
			
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[i].length;j++) {
				
				if(arr[i][j] == find) {
					b = true;
					break;
				}
			}
		}
		
		return b;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter array size");
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		int[][] arr = new int[rows][columns];
		
		System.out.println(isElementExist(arr));
	}
}
