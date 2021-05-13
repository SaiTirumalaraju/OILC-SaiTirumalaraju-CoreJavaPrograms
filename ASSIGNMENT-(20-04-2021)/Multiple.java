
public class Multiple {

	public static void main(String[] args)
	{
		int no=Integer.parseInt(args[0]);
		System.out.println(multi(no));
	}
	public static String multi(int n)
	{
		//(435+99=534; 534/100=5; 5*100=500)
				
		return " "+(((n+99)/100 ) * 100);
	}

}
