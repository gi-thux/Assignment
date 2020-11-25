package assignment;


import java.util.Scanner;

public class Q4SimpleInterest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the principal amount");
		int p=input.nextInt();
		System.out.println("enter time ");	
		int t=input.nextInt();
		System.out.println("enter the rate of interest");
		int r=input.nextInt();
		double SimpleInterest=(p*t*r)/100;
		System.out.println("the  SimpleInterest of given principal is:"+SimpleInterest);
		input.close();
		

}}

