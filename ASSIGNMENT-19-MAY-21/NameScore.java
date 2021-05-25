import java.util.*;
public class NameScore {

	static int getNameScore(String name) {
		int sum = 0;
		for(int i = 0;i < name.length();i++) {
			int ascii = (int)name.charAt(i);
			
			if(ascii > 64 && ascii < 91) {
				sum += ascii - 64;
			}
			else if(ascii > 96 & ascii < 123 ){
				sum += ascii - 96;
			}
			else {
				sum = -1;
				break;
			}
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		System.out.println("Name Score: " + getNameScore(sc.nextLine()));
	}

}
