package com;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		System.out.println("Welcome to ICIC bank");
		System.out.println("====================");

		Scanner sc=new Scanner(System.in);

		Bank b = new BankImpl(0);
		while(true)
		{
			System.out.println("Enter the choice");
			System.out.println("1) Deposite \n2) Withdraw \n3) CheckBalance \n4) Exit \n===================");
			int choice=sc.nextInt();

			int balance =0;


			switch (choice) {
			case 1:System.out.println("Enter amount to be deposite");
			balance=sc.nextInt();
			b=new BankImpl(balance);
			b.deposite(balance);
			break;

			case 2:System.out.println("Enter amount to be withdraw");
			balance=sc.nextInt();
			b.withdraw(balance);
			break;

			case 3:System.out.println(b.checkBalance()); 
			break;

			case 4:System.out.println("Thank you");
			System.exit(0);

			default:
				try {
					throw new InvalidChoiceException("Insuffient Balance");
				}
				catch(Exception e) {
					e.printStackTrace();
				}

			}
			System.out.println("======================");
		}


	}

}
