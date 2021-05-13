
//5.StackOperations.

import java.util.Scanner;

public class MenuDrivenStack {
	static int top = -1;
	static int stack[] = new int[10];

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println(menu());

			int ch = s.nextInt();
			int ele;

			switch (ch) {
			case 1:
				System.out.println("Enter Element to be pushed");
				ele = s.nextInt();
				System.out.println(push(ele));
				break;
			case 2:
				System.out.println(pop());
			case 3:
				System.out.println(display(stack));
				break;
			case 4:
				System.exit(0);

			}
		}
	}

	private static String display(int[] stack) {
		String res1 = "";
		for (int i = 0; i <= top; i++) {
			res1 += " " + stack[i];
		}
		return res1;
	}

	private static String pop() {
		String res = "";

		if (isEmpty()) {
			res = "Stack is Empty";
		} else {
			int ele = stack[top];
			top--;
			res = ele + " is Poped Out";
		}
		return res;
	}

	private static boolean isEmpty() {
		boolean b = false;

		if (top == -1) {
			b = true;
		}
		return b;
	}

	private static String push(int ele) {
		String res = "";
		if (isFull()) {
			res = "Stack Is Full";
		} else {
			stack[++top] = ele;
			res = ele + " is Pushed into Stack";
		}
		return res;
	}

	private static boolean isFull() {
		boolean b = false;

		if (top == stack.length - 1) {
			b = true;
		}
		return b;
	}

	private static String menu() {
		String menu = "Menu Driven Application\n";
		menu += "1.Push\n";
		menu += "2.Pop\n";
		menu += "3.Display\n";
		menu += "4.Exit\n";
		menu += "Choose any Option";
		return menu;
	}

}
