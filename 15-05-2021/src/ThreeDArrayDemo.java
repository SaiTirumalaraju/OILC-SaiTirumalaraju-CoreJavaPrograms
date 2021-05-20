import java.util.Scanner;

public class ThreeDArrayDemo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int college[][][] = new int[2][2][4];
		
		System.out.println(" enter Marks of Each Student:");
		
		for(int i=0;i<college.length;i++) {
			for(int j=0;j<college[i].length;j++) {
				System.out.println("Enter "+(i+1)+" Branch "+(j+1)+" Student "+college[i][j].length+" subject Marks");
				for(int k=0;k<college[i][j].length;k++) {
					college[i][j][k]=s.nextInt();
				}
			}
		}
		
		for(int i=0;i<college.length;i++) {
			for(int j=0;j<college[i].length;j++) {
				for(int k=0;k<college[i][j].length;k++) {
					System.out.print(college[i][j][k]+"  ");
				}
				System.out.println();
			}
			System.out.println("************************************");
		}

	}

}
