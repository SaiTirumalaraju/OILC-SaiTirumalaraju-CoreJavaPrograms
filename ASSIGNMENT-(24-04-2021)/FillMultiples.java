import java.util.Scanner;

public class FillMultiples {
static int j=0;
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter a number:");
		int n=s.nextInt();
		
		int [] mul=getMultiplesArray(n);
		
		for(int i=0;i<mul.length;i++) {
			System.out.println(mul[i]);
		}
	}

	private static int[] getMultiplesArray(int n) 
	{
		if(n>0) {
		int b[]=new int[10];
		for(int i=1;i<=10;i++) {
			b[j]=n*i;
			j++;
		}
		return b;
		}
		else
			return null;
	}

}
