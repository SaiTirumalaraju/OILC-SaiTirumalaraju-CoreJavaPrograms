import java.util.Scanner;

public class MenuDrivenArithmeticOperations {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String res = "";
		while (true) {
			String menu = "Menu Driven Application\n";
			menu += "1.Addition\n";
			menu += "2.Subtraction\n";
			menu += "3.Multiplication\n";
			menu += "4.Division\n";
			menu += "5.Exit\n";
			menu += "Choose any Option";
			System.out.println(menu);

			int ch = s.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter two Numbers:");
				res = "sum=" + (s.nextInt() + s.nextInt());
				break;
			case 2:
				System.out.println("Enter two Numbers:");
				res = "Difference=" + (s.nextInt() - s.nextInt());
				break;
			case 3:
				System.out.println("Enter two Numbers:");
				res = "Product=" + (s.nextInt() * s.nextInt());
				break;
			case 4:
				System.out.println("Enter two Numbers:");
				res = "Division=" + (s.nextInt() / s.nextInt());
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
				break;

			}
			System.out.println(res);
		}
		


	}

}
