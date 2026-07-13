import java.util.Scanner;
class ArrayExample
{
	public static void main(String args[])
	{
		int num[] = new int[10];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<num.length;i++)
		{
			num[i] = sc.nextInt();
		}
		System.out.println("Printing Array using normal for loop:");
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
		System.out.println("Printing Array using enhanced for loop:");
		for(int val:num)
		{System.out.println(val);}
	}
}