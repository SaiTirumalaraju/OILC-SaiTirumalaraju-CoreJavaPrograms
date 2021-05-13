
public class OddRounder {

	public static void main(String[] args) 
	{
		try {
			int n=Integer.parseInt(args[0]);
							//45									(45+9=54; 54/10=5; 5*10=50)
			String res=n>0?((n%2==0)?"Even Number":String.valueOf(((n+9)/10)*10)):"Error";
			
			System.out.println(res);
			}
		catch(Exception e)
		{
			System.out.println("Error");
		}

	}


}
