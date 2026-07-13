import java.util.Scanner;

public class CountOddNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int count=0;
        int i;
		for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(i=0;i<n;i++)
		{
		 if(arr[i]%2 != 0){count+=1;}
		}
		
        System.out.println(count);
    }
}
