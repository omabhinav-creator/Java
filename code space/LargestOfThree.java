import java.util.Scanner;

public class LargestOfThree 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter Values of a,b,c :");
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
		int max = a;
		if( b>a && b>c ){max = b;}
		if( c>a && b<c ){max = c;}
		
        System.out.println(max);
    }
}
