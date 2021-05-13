import java.util.Scanner;

public class Vowel_or_consonent_using_switch {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter a character:");
		char ch = s.next().toUpperCase().charAt(0);

		String res = "";

		if (Character.isAlphabetic(ch)) {

			switch (ch) {
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					res = ch + " is a Vowel";
					break;
				default:
					res = ch + " is a Consonent";
			}
		} else {
			res = "Please! Enter a valid Character";
		}

		System.out.println(res);
	}

}
