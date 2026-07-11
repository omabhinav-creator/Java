import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int units=sc.nextInt();
        int bill=0;	
		if(units>0)
		{
			if(units<100){bill+= units*5;}
			else{bill += 100*5;}
		}
		if(units>100)
		{
			if(units<200){bill+= units*7;}
			else{bill += 100*7;}
		}
		if(units>200)
		{
			bill+=(units-200)*10;
		}
        System.out.println(bill);
    }
}
