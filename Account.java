package BankApplicationpack;

public abstract class Account implements BaseRate {
	
	private String name;
	private String sSn;
	private double balance;
	protected String accountNumber;
	protected double rate;
	private static int counter =10000 ; 
	
	
	
	public Account(String name , String ssN,double initDeposit)
	{
		this.name = name;
		this.sSn = ssN;
		balance = initDeposit;
		
		this.accountNumber = setaccountNumber();
		
		setRate();
		
	}
	
	public abstract void setRate();
	
	private String setaccountNumber()
	{
		String last2SSN = sSn.substring(sSn.length()-2,sSn.length());
		int uniqueID = counter ;
		int randomNum =(int) (Math.random()*Math.pow(10,3));
		return last2SSN + uniqueID + randomNum;
	}
	
	
	public void deposit(double amount)
	{
		balance = balance + amount;
		System.out.println("Depositing ");
	}
	
	public void withdraw(double amount)
	{
		balance = balance - amount;
		System.out.print("Withdrawing ... ");
	}
	
	public void transfer(String tranferaccno, double amount)
	{
			balance = balance - amount;
			System.out.println("Transferring to " + tranferaccno);
	}
	
	public void showbalance()
	{
		System.out.println("Balance :" + balance);
	}
	
	
	public void compound()
	{
		double actualrateofInterest= balance * (rate/100) ;
		System.out.println("Compound Interese :" + actualrateofInterest);
		balance = balance+actualrateofInterest;
	}
	
	public void  showinfo()
	{
		System.out.println(
				"\nNAME :" + name + "\n" +
				"ACCOUNT NUMBER :" + accountNumber +"\n" +
				"AVAILABLE BALANCE :" + balance +"\n" 
				
				);
	}

}
