
public class MenuDrivenQueue 
{
	static int front = 0;
	static int rear = 0;
	static int queue[] = new int[10];
	
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println(menu());

			int ch = s.nextInt();
			int ele;

			switch (ch) {
			case 1:
				System.out.println("Enter Element to be inserted");
				ele = s.nextInt();
				System.out.println(insert(ele));
				break;
			case 2:
				System.out.println(delete());
			case 3:
				System.out.println(display(queue));
				break;
			case 4:
				System.exit(0);

			}
		}

	}
}
	
