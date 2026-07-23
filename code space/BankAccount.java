class BankAccount_Details {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
 /*accountNumber
 accountHolderName;
 balance
 accountType*/
    // Constructor 1
    public void BankAccount(String accountNumber, String accountHolderName, String accountType) 
	{
		this.accountNumber = accountNumber;
		this.balance = 0;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
        // TODO
    }
 
    // Constructor 2 (overloaded)
    public void BankAccount(String accountNumber, String accountHolderName,
                        String accountType, double initialDeposit) 
	{
		this.accountNumber = accountNumber;
		this.balance = initialDeposit;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
        // TODO
    }
 
    public void deposit(double amount) {
		balance = balance + amount;
        // TODO
    }
 
    public void withdraw(double amount) {
		if(balance-amount < 0){System.out.println("Insufficient Balance");return;}
		balance = balance - amount;
        // TODO
    }
 
    public double getBalance() 
	{ 
	    return balance;
        // TODO
    }
 
    public void displayAccountInfo() 
	{
		System.out.println("accountNumber = " + accountNumber);
		System.out.println("accountHolderName = " + accountHolderName);
		System.out.println("accountType = " + accountType);
		System.out.println("balance = " + getBalance);
        // TODO
    }
	
}
public class BankAccount
{
	public static void main(String args[])
	{
		BankAccount_Details Data = new BankAccount_Details();
		Data.accountNumber = 987654321;
        Data.accountHolderName = "Om_Abhinav";
        Data.accountType = "Regular";
		Data.deposit(500);
		Data.withdraw(210);
		Data.displayAccountInfo() ;
	}
}