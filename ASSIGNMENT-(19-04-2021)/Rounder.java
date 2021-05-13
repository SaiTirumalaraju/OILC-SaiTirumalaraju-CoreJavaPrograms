
public class Rounder {

	public static void main(String[] args) {
		
		try {
			int n=Integer.parseInt(args[0]);
											//44		(44+9=53; 53/10=5; 5*10=50)
			String res=n>0?(String.valueOf((n%2!=0)?n:(((n+9)/10)*10))):"Error";
			
			System.out.println(res);
			}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}

}
