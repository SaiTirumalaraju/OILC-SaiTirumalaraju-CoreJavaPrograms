import java.util.Scanner;

public class OccurrenceCounter {

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
		
		System.out.println("Enter a number:");
		int n=s.nextInt();
		
		System.out.println("count:"+getCount(a,n));
		
	}

	private static int getCount(int[] a, int n)
	{
		if(a==null) {
			return -1;
		}
		else {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				count++;
			}
		}
		return count;
	}
	}

}
