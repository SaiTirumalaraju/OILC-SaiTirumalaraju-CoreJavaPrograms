
public class SignFinder {

	public static void main(String[] args)
	{
		try {
		int n=Integer.parseInt(args[0]);
		String res=(n>0)?"positive number":((n<0)?"negative Number":"Zero");
		System.out.println(res);
		}
		catch(Exception e){
			System.out.println("Error");
		}
	}

}
