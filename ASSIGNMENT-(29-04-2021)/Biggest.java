
public class Biggest {

	public static void main(String[] args)
	{
		if(args.length!=5) {
			System.out.println(" Please Enter 5 Integer Values");
			return;
		}
		else {
			try {
				int bignum=Integer.parseInt(args[0]);
				int nextnum=Integer.parseInt(args[1]);
				
				if(bignum<nextnum) {
				bignum=nextnum;
				}
				
				nextnum=Integer.parseInt(args[2]);
				if(bignum<nextnum) {
					bignum=nextnum;
				}
				
				nextnum=Integer.parseInt(args[3]);
				if(bignum<nextnum) {
					bignum=nextnum;
				}
				
				nextnum=Integer.parseInt(args[4]);
				if(bignum<nextnum) {
					bignum=nextnum;
				}
				
				System.out.println("Largest of 5 Values:"+bignum);
				
			}
			catch(NumberFormatException e) {
				System.out.println("Enter Only Numbers");
			}
		}
	}

}
