
public class AlarmClock {

	public static void main(String[] args) 
	{
		try {
		int day=Integer.parseInt(args[0]);
		String s=args[1];
		
		String res=clock(day,s);
		System.out.println(res);
		
	}
		catch(Exception e){
			System.out.println("Error");
		}
	}

	private static String clock(int day, String s) 
	{
		if(day<0 || day>6)
			return " "+(10/0);
		boolean b=true;
		
		if(s.equals("true")||s.equals("false"))
			b=Boolean.parseBoolean(s);
		else
			return " "+(10/0);
		if(day>0||day<6) {
			if(b)
				return " "+("10:00");
			else
				return " "+("7:00");
		}
		else if(day==0||day==6) {
			if(b)
				return " "+("off");
			else
				return " "+("10:00");
			
		}
		else {
			return " "+("Error");
		}
	}

}
