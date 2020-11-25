package day25;

import java.util.Scanner;

public class BankAccount {
	private String name;
	private int accountNumber;
	private int balance;
	
	
	
	
	  BankAccount(String name,int accountNumber,int balance) {
		  this.name=name;
		  this.accountNumber=accountNumber;
	this.balance=balance;
	  }
	 
	public void withrawFund(int withdrawAmount) {
		//this.balance=balance;
		
		int withdrawFee=(2/100)*withdrawAmount;
		balance=this.balance-withdrawFee;
		
		System.out.println("the balance after withdraw is"+balance);

}
	
	public void depositFund(int depositAmount) {
		balance=this.balance+depositAmount;
		int interest=(8/100)*balance;
	    int  newBalance=balance+interest;
	    System.out.println("the new balance after deposit is"+newBalance);
		
	}
	
	public void displayAccount() {
		
		int accountNumber=0;
		int balance=0;
		System.out.println("the account number is"+accountNumber);
		System.out.println("the balance is"+balance);
	}
	public void newAccount(String name, int accountNumber, int balance) {
		this.name=name;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(accountNumber);
		System.out.println(balance);
		
	}
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		/*
		 * System.out.println("enter the name of the account holder"); String
		 * name=input.next();
		 * System.out.println("enter the account number of the"+name); int
		 * accountNumber=input.nextInt();
		 * System.out.println("enter the inital balance of "+name); int
		 * balance=input.nextInt();
		 */
		//BankAccount obj= new BankAccount();
		System.out.println("create new account/withdraw/deposit");
		String operation=input.next();
		
		switch(operation) {
		
		case "create new account":
			System.out.println("enter the name");
			String name=input.next();
			System.out.println("enter the account number");
			int accountNumber=input.nextInt();
			System.out.println("enter the inital balance");
			int balance=input.nextInt();
			
		break;
		
		case  "withdraw" :
		System.out.println("enter the amount to withdraw");
		int withdrawAmount =input.nextInt();
		obj.withrawFund(withdrawAmount);
		
		break;
		
		case "deposit":
		System.out.println("enter the amount to be deposited");
			int depositAmount=input.nextInt();
			obj.depositFund(depositAmount);
			
			break;
			
		default:
			System.out.println("invalid transaction");
			break;}

		//BankAccount testing = new BankAccount(123);
		//System.out.println(testing.display());
		//BankAccount deposit = new BankAccount();
		
		//BankAccount withdraw = new BankAccount();
		
	}
}