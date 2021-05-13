
public class SwapTwoNumWithTemp {

	public static void main(String[] args) 
	{
		try {
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		int temp;
		
		System.out.println("Before Swap:"+n1+" "+n2);
		
		temp=n1;
		n1=n2;
		n2=temp;
		
		System.out.println("After swap:"+n1+" "+n2);
		}
		catch(NumberFormatException e) {
			System.out.println("Enter Only Numbers");
		}
	}
}
