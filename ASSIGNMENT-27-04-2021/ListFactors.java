

public class ListFactors {

	public static void main(String[] args)
	{
		try {
		System.out.println(listOfFacts(Integer.parseInt(args[0])));
		}
		catch(Exception e){
			System.out.println("Error");
		}
	}

	private static String listOfFacts(int n) 
	{
		if(n>0) 
		{
			String s="";
		for(int i=1;i<=n;i++)
		{
			if(n%i==0) {
				s=s+" "+i;
			}	
		}
		return s;
		}
		return ""+10/0;
	}

}
