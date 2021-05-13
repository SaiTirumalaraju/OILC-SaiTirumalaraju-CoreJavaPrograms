
public class SwapTwoNumWithoutTemp {

	public static void main(String[] args) 
	{
		try {
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		
		System.out.println("Before Swap:"+n1+" "+n2);
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		
		System.out.println("After swap:"+n1+" "+n2);
		}
		catch(NumberFormatException e) {
			System.out.println("Enter Only Numbers");
		}
	}

}
