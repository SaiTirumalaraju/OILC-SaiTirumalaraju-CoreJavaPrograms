import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size Of Array:");
		int size=s.nextInt();
		
		int arr[]=new int [size];
		
		System.out.println(" Enter Array:");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		
		System.out.println(getArraySum(arr));
	}

	private static int getArraySum(int[] arr) 
	{
		
		int j=0;
		Arrays.sort(arr);
		int temp=arr[0];
		int sum=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr.length==0) {
				sum=-1;
				break;
			}
			else if(arr[i]<0)
			{
				sum=-2;
				break;
			}
			else {
			if(arr[i]==temp) {
				continue;
			}
			else 
			{
				sum+=arr[i];
			}
			j++;
			temp=arr[i];
			}
		}
		
		
		return sum;
	}

}
