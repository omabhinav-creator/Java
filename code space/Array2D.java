import java.util.Scanner;
class ArrayExample
{
	public static void main(String args[])
	{
		int num[][] = new int[3][2];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[0].length;j++)
			{ num[i][j] = sc.nextInt();}
		}
		System.out.println("Printing 2D Array using normal for loop:");
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[0].length;j++)
			{System.out.println(num[i][j]);}
		}
		System.out.println("Printing 2D Array using enhanced for loop:");
		for(int[] val:num)
		{
			for(int value:val)
			{System.out.println(value+" ");}
		}
	}
}