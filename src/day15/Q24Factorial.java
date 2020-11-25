package day15;
import java.util.Scanner;
public class Q24Factorial {
	
public static void main(String[] args) {
			
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number to give its factoriale:");
		int number= input.nextInt();
		
	   int factorial  = 1;
		System.out.println("original number is" + number);
		
		for(int i=1;i<=number;i++) {
			factorial=factorial*i;
		}
		System.out.println("the factorial of given number is "+factorial);
		
input.close();
}
}