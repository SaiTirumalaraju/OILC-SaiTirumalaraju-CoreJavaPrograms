import java.util.Scanner;

public class BinarySearch {
	
	static int[] sortElementst(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>=arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size = s.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter elements in Array");		
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		arr=sortElementst(arr);
		
		System.out.println("After Sorting Element in Array:");
		
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]+" ");
		}
		
		System.out.println("\n-----------------");
		
		System.out.println("enter searching Element in array");
		
		int search = s.nextInt();
		
		int low=0,high=size-1,flag=0,mid=0;
		
		while(low<=high) {
			mid=(low+high)/2;
			
			if(arr[mid]==search) {
				flag=1;
				break;
			}
			else if(arr[mid]<search) {
				low=mid+1;
			}
			else if(arr[mid]>search){
				high=mid-1;
			}
		}
		if(flag==1)
			System.out.println(search+" Element is found at"+mid);
		else
			System.out.println(search+" Element is not found");
	}

}
