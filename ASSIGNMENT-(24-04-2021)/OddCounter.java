import java.util.Scanner;

public class OddCounter {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
	
		int a[]=new int[10];
		try {
		System.out.println("Enter "+a.length+" values into Array");
		
		for(int i=0;i<a.length;i++) 
		{
			a[i]=s.nextInt();
		}
		
		System.out.println(getOddCount(a));
	}
		catch(Exception e) {
			System.out.println("-1");
		}
		
	}

	private static String getOddCount(int[] a)
	{
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0)
				count++;
		}
		return ""+count;
	}

}
