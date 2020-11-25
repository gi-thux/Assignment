package day25;



public class TestBankAccount {

	public static void main(String[] args) {
		
	
		BankAccount1 ramAccount= new BankAccount1("ram");
		ramAccount.depositFund(500);
		ramAccount.withrawFund(150);
		
		
		BankAccount1 hariAccount= new BankAccount1("Hari",2500);
		hariAccount.depositFund(500);
		hariAccount.withrawFund(150);
		
		ramAccount.depositFund(600);
		

}
}