
public class GeneratePalindrome {

	public static void main(String[] args) 
	{
		try {
		System.out.println(getPalindromeList(Integer.parseInt(args[0])));
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}
	static String output="";

	private static String getPalindromeList(int n)
	{
		if(n>=100||n<=999) {
		 int temp, r, rev=0, sum;
	        temp=n;
	        output = output + temp ;
	        while(n > 0) {
	            r = n % 10;
	            rev = rev * 10 + r;
	            n = n / 10;
	        }
	        if(rev == temp)
	            return output;
	        output = output + "," + rev + ",";
	        sum = temp + rev;
	        return getPalindromeList(sum);
		}
		return ""+10/0;
	}
}
