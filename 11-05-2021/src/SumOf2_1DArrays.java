
/*3) Wap to add two single dimentional arrays?

    int a[] = new int[5];
    int b[]= new int[5];
     int[] sum(int a[],int b[]) {

 }*/

import java.util.Scanner;

public class SumOf2_1DArrays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a[] = new int[5];
		int b[] = new int[5];

		System.out.println("Enter " + a.length + " values into Array A ");

		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}

		System.out.println("Enter " + b.length + " values into Array B ");

		for (int i = 0; i < b.length; i++) {
			b[i] = s.nextInt();
		}

		int sum[] = sum(a, b);
		for (int i : sum) {
			System.out.print(i + " ");
		}
	}

	private static int[] sum(int[] a, int[] b) {
		int sum[] = new int[5];
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				sum[i] = a[i] + b[i];
			}
		}
		return sum;
	}

}
