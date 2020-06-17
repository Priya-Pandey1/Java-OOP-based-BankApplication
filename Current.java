package BankApplicationpack;

public class Current extends Account {
	
	private int debitCardNUmber;
	private int debitCardPin;
	
	public Current(String num , String ssN,double initDeposit)
	{
		super(num,ssN,initDeposit);
		accountNumber = "1"+accountNumber;
		System.out.print("NEW CURRENT ACCOUNT");
	}
	public void setRate()
	{
		 rate = getBaserate()*.10;
		
	}
	public void showinfo()
	{
		System.out.print("This is Currenr Account ");
		super.showinfo();
		
		
	}
}
