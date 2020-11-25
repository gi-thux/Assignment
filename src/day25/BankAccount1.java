package day25;

public class BankAccount1 {
	   private String name;
		private static int accountNumber=1000;
		private double initialBalance;
		private int accountNum;
		
		 public BankAccount1(String name) {
			  this.name=name;
			  this.initialBalance=0;
			  this.accountNum=accountNumber++;
		displayInfo();
		  }
		 
		
		
		 public BankAccount1(String name,double initalBalance) {
			  
			  this.name=name;
			  this.initialBalance=initialBalance;
			  this.accountNum=accountNumber++;
		displayInfo();
		  }
		 
		public void withrawFund(double amount) {
			initialBalance=initialBalance-amount;
			displayInfo();
	}
		
		public void withrawFund(double amount,double fee) {
			initialBalance=initialBalance-amount-fee;
			displayInfo();
	}
		
		public void depositFund(double amount) {
			initialBalance=this.initialBalance+amount;
			displayInfo();
		}
		public void depositFund(double amount, double interest) {
			initialBalance=this.initialBalance+amount;
			initialBalance=this.initialBalance+(initialBalance*interest/100);
			displayInfo();
		}
		
		public void displayAccount() {
			
			int accountNumber=0;
			int balance=0;
			System.out.println("the account number is"+accountNumber);
			System.out.println("the balance is"+balance);
		}
	
		
		public void displayInfo() {
			
	System.out.println("==============");
			System.out.println("Account Name is: "+name);
			System.out.println("Account Number is: "+ accountNum);
			System.out.println("Balance is : "+ initialBalance);
			System.out.println("============");
			
		}}
		