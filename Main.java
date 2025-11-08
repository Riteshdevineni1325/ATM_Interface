package task3;
import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		System.out.print("Enter total balance in your account: ");
		try
		{
			float Balance=read.nextInt();
			ATM obj=new ATM(Balance);
			while(true)
			{
				System.out.println("Select any number from below shown menu");
				System.out.println("1. Withdraw Amount\n2. Deposit Amount\n3. Check Balance\n4. Exit");
				System.out.print("Select your choice: ");
				int choice=read.nextInt();
				switch(choice)
				{
					case 1:
						System.out.print("Amount to Withdraw: ");
						float amount=read.nextFloat();
						if(obj.withdraw(amount))
							System.out.println("Successfully Withdrawed Amount: "+amount);
						else
							System.out.println("Try again");
						break;
					case 2:
						System.out.print("Amount to Deposit: ");
						float amt=read.nextFloat();
						obj.deposit(amt);
						System.out.println("Successfully Deposited Amount: "+amt);
						break;
					case 3:
						System.out.println("Remaining Balance in the account: "+obj.CheckBalance());
						break;
					case 4:
						System.out.println("Thank you for using this platform, see you soon");
						read.close();
						return;
					default:
						System.out.println("Select valid number");
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Invalid amount of balance, try again");
			return;
		}
	}
}
