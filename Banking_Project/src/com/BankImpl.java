package com;

public class BankImpl implements Bank {
	int balance;

	public BankImpl(int balance) {
		this.balance = balance;
	}

	@Override
	public void deposite(int amount) {
		System.out.println("depositing Rs."+amount);
		balance=balance+amount;
		System.out.println("Amount to be deposited ");

	}

	@Override
	public void withdraw(int amount) {
		if(amount<=balance)
		{
			System.out.println("withdrawing Rs."+amount);
			balance-=amount;
			System.out.println("Amount withdrawn ");
		}
		else
		{
			try {
				throw new InsuffientBalance("Insuffient Balance");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public int checkBalance() {

		return balance;
	}

}
