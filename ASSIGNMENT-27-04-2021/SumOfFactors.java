
public class SumOfFactors {

	public static void main(String[] args)
	{
		try {
			System.out.println(sumOfFacts(Integer.parseInt(args[0])));
			}
			catch(Exception e){
				System.out.println("Error");
			}
		}

		private static String sumOfFacts(int n) 
		{
			if(n>0) 
			{
				int sum=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0) {
					sum=sum+i;
				}	
			}
			return ""+sum;
			}
			return ""+10/0;
	}

}
