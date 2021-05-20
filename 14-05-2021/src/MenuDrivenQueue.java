import java.util.Scanner;

public class MenuDrivenQueue {
	static int front = 0;
	static int rear = 0;
	static int queue[] = new int[10];

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
				System.out.println(insert(ele));
				break;
			case 2:
				System.out.println(delete());
				break;
			case 3:
				System.out.println(display(queue));
				break;
			case 4:
				System.exit(0);

			}
		}
	}

	private static String display(int[] stack) {
		String res1 = "";
		for (int i = 0; i <= rear - 1; i++) {
			res1 += queue[i] + "\n";
		}
		return res1;
	}

	private static String delete() {
		String res = "";

		if (isEmpty()) {
			res = "Stack is Empty";
		} else {
			int ele = queue[front];
			for (int i = front; i < (rear - 1); i++) {
				queue[i] = queue[i + 1];
			}
			rear--;
			res = ele + " is Poped Out";
		}
		return res;
	}

	private static String insert(int ele) {
		String res = "";
		if (isFull()) {
			res = "Queue Is Full";
		} else {
			queue[rear++] = ele;
			res = ele + " is Pushed into Stack";
		}
		return res;
	}

	private static String menu() {
		String menu = "QUEUE OPERATIONS\n";
		menu += "1.Insert\n";
		menu += "2.Delete\n";
		menu += "3.Display\n";
		menu += "4.Exit\n";
		menu += "Choose any Option";
		return menu;
	}

	private static boolean isEmpty() {
		boolean b = false;

		if (front == rear) {
			b = true;
		}
		return b;
	}

	private static boolean isFull() {
		boolean b = false;

		if (rear == queue.length) {
			b = true;
		}
		return b;
	}

}
