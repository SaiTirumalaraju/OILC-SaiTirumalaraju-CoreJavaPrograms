import java.util.Scanner;

public class FourPerLine {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a value");
		
		System.out.println(getFourPerLine(s.nextInt()));
	}

	private static String getFourPerLine(int val) 
	{
		String res="";
		
		if(val<0) {
			res=""+-1;
		}
		else if(val==0) {
			res=""+-2;
		}
		else if(val>99){
			res=""+-3;
		}
		else{
			for(int i=1;i<=val;i++) {
				if(i%4==0) {
					res+=i+"\n";
				}
				else {
					res+=i+" ";
				}
			}
		}
		return res;
	}

}
