import java.util.Scanner;

public class FillMultiples {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println(" Enter a Integer");
		int num=s.nextInt();
		int res[]=getMultiplesArray(num);
		int j=1;
		for(int i=0;i<res.length;i++) {
			System.out.println(num+" * "+j+" = "+res[i]);
			j++;
		}
	}

	private static int[] getMultiplesArray(int num) 
	{
		int arr[]=new int[10];
		if(num == 0) {
			return null;
		}
		else 
		{
			int j=0;
			for(int i=1;i<=arr.length;i++) {
				arr[j]=num*i;
				j++;
			}
		}
		return arr;
	}

}
