public class Student {
	public static void main(String[] args)
	{
		int total = 0, marks ;
		float avg;
		String grade = "";
		
		if(args.length != 5) 
		{
			System.out.println("Please Give 5 Values ");
			return;
		}
		
		
		try {
			boolean b = true;
			for(int i = 0;i < args.length;i++) 
			{
				marks = Integer.parseInt(args[i]);
				if(marks < 35)
				{
					b = false;
					System.out.println("Fail");
					break;
				}
				else 
				{
					total = total + marks;
				}
			}
			if(b) 
			{
				avg = total / 5;
				if(total >= 400)
				{
					grade = "A grade";
				}
				else if((total >= 300) && (total < 400))
				{
					grade = "B grade";
				}
				else if((total >= 200) && (total < 300))
				{
					grade = "C grade";
				}
				else
				{
					grade = "D grade";
				}
				
				System.out.println("Total : " + total + "\n" + "Average : " + avg + "\n" + "Grade : " + grade);
			}
		}
		catch(NumberFormatException ne) {
			System.out.println("Please enter Integer values only");
		}
	}
}
