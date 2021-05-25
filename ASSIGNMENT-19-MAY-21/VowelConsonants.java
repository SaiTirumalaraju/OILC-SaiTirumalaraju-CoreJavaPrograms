import java.util.*;

import javax.naming.NameClassPair;
public class VowelConsonants {
	static String vowelConsonant(String name) {
		name = name.toLowerCase();
		String result = "";
		String vowel = "";
		String consonant = "";
		
		for(int i = 0;i < name.length();i++) {
			switch(name.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowel += name.charAt(i);
				break;
			default:
				consonant += name.charAt(i);
			}
		}
		
		result += "Vowels are : " + vowel + "\nConsonants are: " + consonant;
		
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");

		System.out.println(vowelConsonant(sc.nextLine()));
	}

}
