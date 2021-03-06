import java.text.NumberFormat;

class Account
{
	private final double RATE = 0.03;
	
	private long acctNumber;
	private double balance;
	private String name;
	
	
	public Account ( long acctNumber, double balance, String name)
	{
		
		this.acctNumber = acctNumber;
		this.balance = balance;
		this.name = name;
	}
	
	public double deposit ( double amount)
	{
		balance = balance + amount;
		return balance;
	}
	
	public double withdraw ( double amount, double fee)
	{
		if ( amount + fee > balance)
			System.out.println ( "Not enough funds to withdraw" );
		else
			balance = balance - amount - fee;
		
		return balance;
	}
	
	public double addInterest()
	{
		balance += (balance * RATE);
		return balance;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return acctNumber + "\t" + name + "\t" + fmt.format(balance);
	}
}

class Management
{
	public Account[] Database;
	private int count;

	public Management()
	{
		Database = new Account[30];
		count = 0;
	}
	public void addAccount ( long acctNumber, double balance, String name)
	{
		if ( count == Database.length - 1)
			System.out.println ( " Maximum number of accounts is almost reached! ");
	
		Database[count] = new Account ( acctNumber, balance, name);
		count++;
	}
	public void AllInterest()
	{
		for ( int counter = 0; counter < count; counter++)
		Database[counter].addInterest();
	}
	public String toString()
	{
		String report = "-------------------------------------------------------------\n";
		report += "Account List:\n\n ";
	
		for ( int number = 0; number < count; number++)
			report +=Database[number].toString() + "\n";
		return report;
	}
}

class Homework6b
{
	public static void main ( String[] args )
	{
		Management Peoples = new Management();
		
		Peoples.addAccount(001, 100.00, " Dan Chiem" );
		Peoples.addAccount(002, 2443.00, " Nick Bro" );
		Peoples.addAccount(003, 253.39, " Joshy guy" );
		
		System.out.println ( Peoples);
		
		System.out.println (" depositing in Dan's Account and withdrawing in Nick's Account");
		Peoples.Database[0].deposit(100.00);
		Peoples.Database[1].withdraw(443.00,5.00);
		
		System.out.println ( Peoples);
		
		System.out.println ("After 3% interest");
		Peoples.AllInterest();
		System.out.println (Peoples);
		
		System.out.println ("Trying to withdraw more than the balance \n" );
		Peoples.Database[2].withdraw(500.00,5.00);
		
		
		
	 
	}
}
