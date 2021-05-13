
public class Sum {

	public static void main(String[] args) {
		
		try {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int  sum=0;
		if(a>=0&&b>=0&&c>=0) 
		{
			sum=sum+Integer.parseInt(round(a))+Integer.parseInt(round(b))+Integer.parseInt(round(c));
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

	private static String round(int n)
	{
		
		if(n/10!=0) {
			//(35/10=3; 3+1=4; 4*10=40)
		return ""+(((n/10)+1)*10);
		}
		return ""+n;
	}

}
