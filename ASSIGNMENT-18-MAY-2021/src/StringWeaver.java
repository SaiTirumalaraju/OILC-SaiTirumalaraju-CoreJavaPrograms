import java.util.Scanner;

public class StringWeaver {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println(" Enter Two Strings:");
		
		System.out.println(getWeavedString(s.nextLine(),s.nextLine()));
	}

	private static String getWeavedString(String str1, String str2)
	{
		String res="";
		
		if(str1.length()==0 && str2.length()==0) {
			res=""+-1;
		}
		else if(str1.length()>str2.length()) {
			res=str2+str1+str2;
		}
		else if(str1.length()<str2.length()) {
			res=str1+str2+str1;
		}
		else if(str1.length()==str2.length()){
			for(int i=0;i<str1.length();i++) {
				res+=str1.charAt(i)+""+str2.charAt(i);
			}
		}
		return res;
	}

}
