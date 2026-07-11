import java.util.Scanner;
class Arr{
 public static void main(String args[]){
 int a;
 System.out.print("Enter Greater Value");
 Scanner scanner = new Scanner(System.in);
 a = scanner.nextInt();
 int b;
 System.out.print("Enter Least Value");
 b = scanner.nextInt();
 int q=0,r=-1;
 System.out.print("The HCF of "+a+" and "+b+" is ");
 while (a>b && r!=0)
 {
	 q = a/b;
	 r = a%b;
	 a = b;
	 b = r;
 }	 
 System.out.print(a);
 }
}