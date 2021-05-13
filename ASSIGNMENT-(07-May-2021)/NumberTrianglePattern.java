import java.util.Scanner;

public class NumberTrianglePattern {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a value:");

		System.out.println(NumberPattern4(s.nextInt()));
	
	}

	private static String NumberPattern4(int val) 
	{
		
		String res="";
		
		if(val<0) {
			res=""+-1;
		}
		else if(val==0) {
			res=""+-2;
		}
		else {
			int k;
			for(int i=1;i<=val;i++) {
				k=i;
				for(int j=1;j<=i;j++) 
				{
					res+=" "+k+" ";
					k=i*(j+1);
				}
				res+="\n";
			}
		}
		return res;
		
	}

}
