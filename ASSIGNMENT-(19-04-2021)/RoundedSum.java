
public class RoundedSum {

	public static void main(String[] args) 
	{
		try {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=Integer.parseInt(args[2]);
			int sum=0;
			if(a>=0&&b>=0&&c>=0) {
				sum=sum+round(a)+round(b)+round(c);
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
		int num=0;
		if(n%10>=5)
		{	//(35/10=3; 3+1=4; 4*10=40)
			num=((n/10)+1)*10;
		}
		else {
			//(32/10=3; 3*10=30)
			num=(n/10)*10;
		}
		return num;
	}

}
