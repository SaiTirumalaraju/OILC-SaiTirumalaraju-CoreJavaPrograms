import java.util.*;
public class StringReverse {

	static String reverseStr(String str) {
		String res = "";
		String[] str2 = str.split(" ");
		for(int i = 0;i < str2.length;i++) {
			StringBuffer sb = new StringBuffer(str2[i]);
			String temp = sb.reverse().toString().toLowerCase();
			temp = temp.substring(0, 1).toUpperCase() + temp.substring(1);
			res += temp + " ";
		}
		
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		System.out.println(reverseStr(sc.nextLine()));

	}

}