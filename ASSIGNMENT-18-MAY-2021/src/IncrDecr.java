import java.util.Scanner;

public class IncrDecr {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter an Integer:");
		
		int num = s.nextInt();
		
		int res[]=getIncreaseDecrease(num);
		
		System.out.print("{");
		for(int i : res) {
			System.out.print(i+" ");
		}
		System.out.print("}");
	}

	private static int[] getIncreaseDecrease(int num) 
	{
		int arr[] = new int[num];
		int k=num;
		int i=1;
		if(num <=1) {
			return null;
		}
		else if(num>20) {
			return null;
		}
		else {
		for(int j=0;j<arr.length;j++)
		{
			if(j%2==0) 
			{
				arr[j]=i;
				i++;
			}
			else 
			{
			arr[j]=k;
			k--;
			}
		}
		return arr;
		
		}
	}

}
