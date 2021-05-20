import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args)
	{
		int i,n,search;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter size of Array");
		n = s.nextInt();
		
		int array[]=new int [n];
		
		System.out.println("Enter "+n+"Elements into Array");
		
		for(i=0;i<n;i++) {
			array[i]=s.nextInt();
		}
		
		System.out.println("Enter a Search element:");
		search=s.nextInt();
		
		for(i=0;i<n;i++) {
			if(array[i]==search) {
				System.out.println(search+"is Present at Location"+(i+1)+",");
				break;
			}
		}
		if(i==n)
			System.out.println(search+" is not there in Array");
	}

}
