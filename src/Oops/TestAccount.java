package Oops;

class Account
{
	int acc_num;
	String name;
	double amount;
	
	//constructor
	public Account(int acc_num,String name,double amount)
	{
		this.acc_num = acc_num;
		this.name = name;
		this.amount = amount;
	}
	
	void CheckBalance()
	{
		System.out.println("balance is " + amount);
	}
	
	void Display()
	{
		System.out.println(acc_num + " " + name + " " + amount);
	}
	
	void deposit(double amt)
	{
		amount = amount + amt;
		System.out.println("amount deposited " + amt);
		CheckBalance(); 
	}
	
	void withdraw(double amt)
	{
		if(amount<amt)
		{
			System.out.println("insufficient balance");
		}
		amount =amount-amt;
		CheckBalance();
		
	}
}

public class TestAccount {

	public static void main(String[] args) 
	{
		 Account a1 = new Account(1234, "shivam", 1000);
		 a1.withdraw(200);
		 a1.deposit(300);
		 a1.Display();
	}

}
