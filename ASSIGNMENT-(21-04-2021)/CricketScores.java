
public class CricketScores {

	public static void main(String[] args) 
	{
		try {
			System.out.println(getDisplayDetails(Integer.parseInt(args[0]),Float.parseFloat(args[1])));
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

	private static String getDisplayDetails(int runs, float overs)
	{
		int i=(int)overs;
		float d=overs-i;
		int balls=(int)(i*6+(int)(d*10));
		if(balls<100)
			return (runs+"runs in balls "+balls+" @ "+((float)runs/balls)+" per ball");
		else if(balls>100)
			return (runs+"runs in overs "+overs+" @ "+((float)runs/overs)+" per over");
		return ""+10/0;
	}

}
