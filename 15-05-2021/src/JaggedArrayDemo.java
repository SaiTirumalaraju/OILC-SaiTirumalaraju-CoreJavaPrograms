import java.util.Scanner;

public class JaggedArrayDemo {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int studs[][]=new int[3][];
		studs[0]=new int[3];
		studs[1]=new int[2];
		studs[2]=new int[1];
		
		for(int i=0;i<studs.length;i++) {
			System.out.println("Enter"+(i+1)+" Student"+studs[i].length+" Subject Marks");
			for(int j=0;j<studs[i].length;j++) {
				studs[i][j]=s.nextInt();
				}
		}
		
		for(int i=0;i<studs.length;i++) {
			for(int j=0;j<studs[i].length;j++) {
				System.out.print(studs[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
