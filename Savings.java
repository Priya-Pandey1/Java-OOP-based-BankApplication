package BankApplicationpack;

public class Savings extends Account{
	
	private int safetyBoxid;
	private int safetyBoxKey;
	public Savings(String num , String ssN,double initDeposit)
	{
		super(num,ssN,initDeposit);
		accountNumber = "1" + accountNumber;
		System.out.print("NEW SAVINGS  ACCOUNT");
	}
	public void setRate()
	{
		 rate = getBaserate() - .25;
		
	}
	
	private void setSafetyInputBox()
	{
		safetyBoxid = (int)(Math.random()*Math.pow(10, 3));
		safetyBoxKey = (int)(Math.random()*Math.pow(10,4));
	}
	public void showinfo()
	{
		super.showinfo();
		
		
	}

}
