import java.util.Scanner;

public class CricketScores {

	public static void main(String[] args) 
	{
		int runs=0;
		float overs=0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Runs and Overs data");
		
		runs=s.nextInt();
		overs=s.nextFloat();
		
		System.out.println(getDisplayDetails(runs,overs));
		
		
	}

	private static String getDisplayDetails(int runs, float overs)
	{
		String res="";
		int i=(int)overs;
		float d=overs-i;
		int balls=(int)(i*6+(int)(d*10));
		if(balls<100)
			res=runs+" runs in balls "+balls+" @ "+((float)runs/balls)+" per ball";
		else if(balls>100)
			res=runs+" runs in overs "+overs+" @ "+((float)runs/overs)+" per over";
		return res;
		
	}

}