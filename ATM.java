package task3;

public class ATM {
	float balance;
	ATM(float balance)
	{
		this.balance=balance;
	}
	public boolean withdraw(float amount)
	{
		if(amount>balance)
		{
			System.out.println("Not sufficient funds");
			return false;
		}
		balance-=amount;
		return true;
	}
	public void deposit(float amount)
	{
		balance+=amount;
	}
	public float CheckBalance()
	{
		return balance;
	}
}
