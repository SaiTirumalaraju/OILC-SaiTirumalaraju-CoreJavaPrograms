
/*
 * 4)Wap to addition,subtraction, multiplication  2*2 matrix values

       int a[][] = {{1,2},{3,4}};
       int b[][] = {{2,2},{1,4}};
   
       int[][]  sum(int a[][],int b[][]) {

      }
 */

import java.util.Scanner;

public class MenuDrivenOperationsMatrix {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a[][] = new int[2][2];
		int b[][] = new int[2][2];

		System.out.println("Enter " + (2 * 2) + "Values into Array A");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = s.nextInt();
			}
		}

		System.out.println("Enter " + (2 * 2) + "Values into Array B");

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = s.nextInt();
			}
		}

		while (true) {
			System.out.println(menu());

			int ch = s.nextInt();

			switch (ch) {
			case 1:
				int sum[][] = sum(a, b);
				System.out.println(display(sum));
				break;
			case 2:
				int diff[][] = diff(a, b);
				System.out.println(display(diff));
				break;
			case 3:
				int mul[][] = mul(a, b);
				System.out.println(display(mul));
				break;
			case 4:
				System.exit(0);

			}
		}

	}

	private static int[][] mul(int[][] a, int[][] b) {
		int res[][] = new int[2][2];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				res[i][j] = 0;
				for (int k = 0; k < a[i].length; k++) {
					res[i][j] = res[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		return res;
	}

	private static int[][] diff(int[][] a, int[][] b) {
		int res[][] = new int[2][2];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				res[i][j] = a[i][j] - b[i][j];
			}
		}
		return res;
	}

	private static String display(int[][] res) {
		String res1 = "";
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				res1 += " " + res[i][j];
			}
			res1 += "\n";
		}
		return res1;
	}

	private static int[][] sum(int[][] a, int[][] b) {
		int res[][] = new int[2][2];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				res[i][j] = a[i][j] + b[i][j];
			}
		}
		return res;
	}

	private static String menu() {
		String menu = "Menu Driven Application\n";
		menu += "1.Addition Of Matrices\n";
		menu += "2.Subtraction Of Matrices\n";
		menu += "3.Multiplication Of Matrices\n";
		menu += "4.Exit\n";
		menu += "Choose any Option";
		return menu;
	}

}
