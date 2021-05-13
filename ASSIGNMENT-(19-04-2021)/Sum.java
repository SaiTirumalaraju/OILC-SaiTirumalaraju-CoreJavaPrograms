
public class Sum {

	public static void main(String[] args) {
		
		try {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		if(a>=0&&b>=0&&c>=0) 
		{
		int sum=round(a)+round(b)+round(c);
		System.out.println(sum);
		}
		else {
			System.out.println("Error");
		}
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

	private static int round(int n)
	{
		
		if(n/10!=0) {
			//(35/10=3; 3+1=4; 4*10=40)
		return (((n/10)+1)*10);
		}
		return n;
	}

}
