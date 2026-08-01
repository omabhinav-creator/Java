import java.util.Scanner;
class SumOfDigits{
	public int SumOfDigits(int n)
	{
		int sum = 0,r;
		if(n<0){return -1;}
		while(r!=0)
		{
			r = n%10;
			n = n/10;
			sum += r;
		}
		return sum;
	}
	public static void main(String args[])
	{
		SumOfDigits m = new SumOfDigits;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(m.SumOfDigits(num));
	}
}