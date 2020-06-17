package BankApplicationpack;

import java.util.LinkedList;
import java.util.List;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Savings sav1 = new Savings("DINESH","2567w8r3i975454398",100000);
		
		sav1.showinfo();
		sav1.compound();
		
		*/
		
		List<Account> list = new LinkedList<Account>();
		String file = "/home/priya/Downloads/original.csv";
		List<String[]> newCustomers = utilities.Csv.read(file);
		
		for(String[] acholder : newCustomers)
		{
			String name = acholder[0];
			String ssN = acholder[1];
			String accounttype = acholder[2];
			double initDeposit = Double.parseDouble(acholder[3]);
			if(accounttype.equals("Savings"))
			{
				list.add( new Savings(name,ssN,initDeposit));
			}
			else if(accounttype.equals("Checking"))
			 list.add(new Current(name,ssN,initDeposit));
			else 
			{
				System.out.println("Error creating account");
			}
			
		}
		for(Account ac : list)
		{
			ac.showinfo();
			System.out.println();
		}
	}

}
