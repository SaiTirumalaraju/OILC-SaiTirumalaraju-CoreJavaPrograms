import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the Values:");
		
		int array[]=new int[5];
		
		for(int i=0;i<array.length;i++) {
			array[i]=s.nextInt();
		}
		
		dispElementsInArray(array);
		
		sortAnArray(array);
	}
	
	static void dispElementsInArray(int arr[]) {
		
		System.out.println("Array Elements as Follows \n");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}

	static void sortAnArray(int arr[]) {
		int size = arr.length;
		int temp;
		System.out.println("\n Sorting ARray Using Selection Sort TEchnique..\n");
		for(int i=0;i<size;i++) {
		for(int j=i+1;j<size;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		}
		dispElementsInArray(arr);
		
	}
}
