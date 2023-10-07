import java.util.Scanner;
public class MatrixZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter square matrix size:");
		int size = sc.nextInt();
		int k=size-1, l=0;
		int[][] Matrix = new int[size][size];
		System.out.println("Enter elements:");
		for (int i=0;i<size;i++) {
			for (int j=0;j<size;j++) {
				Matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Resultant Matrix:");
		for (int i=0;i<size;i++) {
			for (int j=0;j<size;j++) {
				if(i==j) {
					Matrix[i][j]=0;
				}
				if(i==l && j==k) {
					Matrix[i][j]=0;
					l++;
					k--;
				}
				System.out.print(Matrix[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
}
