import java.util.Scanner;
class Factorial
{
	
	public int factorial(int n)
	{
		int fact = 1;
		for(int i=1 ; i<= n ; i++)
		{
			fact *= i;
		}
		return fact;
	}
	public int fact(int n)
	{
		if (n == 0 || n == 1){return 1;}
	    else{return n*fact(n-1);}
	}
	public static void main(String args[])
	{
		System.out.print("\nEnter Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Factorial O1 = new Factorial();
		int factorial = O1.factorial(num);
		System.out.println("\nFactorial Using Loop= " + factorial);
		int fact = O1.fact(num);
		System.out.println("\nFactorial Using Recursion= " + fact);
	}
}