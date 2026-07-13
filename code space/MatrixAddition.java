import java.util.Scanner;
class MatrixAddition
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of rows :");
		int r = sc.nextInt();
		System.out.print("Enter number of columns :");
		int c = sc.nextInt();
		
		int[][] A = new int[r][c];
		int[][] B = new int[r][c];
		int[][] res = new int[r][c];
		System.out.println("Enter Matrix A:");
		for(int i=0 ; i<r ; i++)
		{
			for(int j=0 ; j<c ; j++)
			{
				A[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter Matrix B:");
		for(int i=0 ; i<r ; i++)
		{
			for(int j=0 ; j<c ; j++)
			{
				B[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nPerforming Addition...\n");
		for(int i=0 ; i<r ; i++)
		{
			for(int j=0 ; j<c ; j++)
			{
				res[i][j] = A[i][j] + B[i][j];
			}
		}
		System.out.println("Resultant Matrix");
		for(int[] val:res)
		{
			for(int value:val)
			{System.out.println(value+" ");}
		}
	}
}