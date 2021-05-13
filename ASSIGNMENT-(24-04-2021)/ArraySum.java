import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array");
		int len=s.nextInt();
		int a[]=new int[len];
		System.out.println("Enter "+len+" values into Array");
		
		for(int i=0;i<len;i++) 
		{
			a[i]=s.nextInt();
		}
		
		System.out.println(getSum(a));
	
	}

	private static String getSum(int[] a)
	{
		int sum=0;
		if(a.length!=0) {
		for(int i=0;i<a.length;i++)
		{
				sum=sum+a[i];
		}
		return ""+sum;
		}
		else
			return ""+(-1);
	}

}
