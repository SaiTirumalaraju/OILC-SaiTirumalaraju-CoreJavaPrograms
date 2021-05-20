import java.util.Scanner;

public class Fibonaccii {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		
		System.out.println(getFibonacciiSeries(s.nextInt()));
	}

	private static String getFibonacciiSeries(int num)
	{
		String res="";
		if(num<=0) {
			res=null;
		}
		else {
		int sum=0;
		int n1=0,n2=1;
		res+=n1+" "+n2+" ";
		for(int i=2;i<num;i++) 
		{
			sum=n1+n2;
			n1=n2;
			n2=sum;
			res+=sum+" ";
		}
		}
		return res;
	}

}
