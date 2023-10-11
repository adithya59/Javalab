import java.util.Scanner;
public class MatrixMultiply {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ROW1, ROW2, COL1, COL2;
		System.out.println("Enter size of first matrix:");
		ROW1=sc.nextInt();
		COL1=sc.nextInt();
		System.out.println("Enter size of second matrix:");
		ROW2=sc.nextInt();
		COL2=sc.nextInt();
		int[][] Matrix1 = new int[ROW1][COL1];
		int[][] Matrix2 = new int[ROW2][COL2];
		int[][] Matrix3 = new int[ROW1][COL2];
		if (COL1!=ROW2) {
			System.out.println("This operation is not possible");
		}
		else {
			System.out.println("Enter Elements of first matrix:");
			for (int i=0;i<ROW1;i++) {
				for (int j=0;j<COL1;j++) {
					Matrix1[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter Elements of second matrix:");
			for (int i=0;i<ROW2;i++) {
				for (int j=0;j<COL2;j++) {
					Matrix2[i][j] = sc.nextInt();
				}
			}
			System.out.println("Resultant Matrix:");
			for (int i=0;i<ROW1;i++) {
				for (int j=0;j<COL2;j++) {
					Matrix3[i][j]=0;
					for (int k=0;k<COL1;k++) {
						Matrix3[i][j]+=Matrix1[i][j]*Matrix2[i][j];
					}
					System.out.print(Matrix3[i][j]+"\t");
				}
				System.out.println("\n");
			}
		}
	}
}
