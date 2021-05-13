
public class FindAbsolute {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int res = 0;
		if (n > 0) {
			res = n;
		} else if (n < 0) {
			res = n * (-1);
		}
		System.out.println(res);
	}

}
