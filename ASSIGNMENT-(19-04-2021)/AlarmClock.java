
public class AlarmClock {

	public static void main(String[] args) 
	{
		try {
		int day=Integer.parseInt(args[0]);
		String s=args[1];
		if(day<0 || day>6)
			System.out.println(10/0);
		boolean b=true;
		
		if(s.equals("true")||s.equals("false"))
			b=Boolean.parseBoolean(s);
		else
			System.out.println(10/0);
		if(day>0||day<6) {
			if(b)
				System.out.println("10:00");
			else
				System.out.println("7:00");
		}
		else if(day==0||day==6) {
			if(b)
				System.out.println("off");
			else
				System.out.println("10:00");
			
		}
		else {
			System.out.println("Error");
		}
		
	}
		catch(Exception e){
			System.out.println("Error");
		}
	}

}
