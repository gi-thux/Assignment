package assignment;


import java.util.Scanner;

public class Q8aTemperatureD2F {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the temperature in degree celcius ");
		int t=input.nextInt();
		
		
		double fahrenheit=(t*1.8)+32;
		System.out.println("the temperature of given degree celcius in fahrenheit id:"+fahrenheit);
		input.close();
		

	}
	
}
