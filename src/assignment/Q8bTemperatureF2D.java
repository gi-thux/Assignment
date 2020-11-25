package assignment;


import java.util.Scanner;

public class Q8bTemperatureF2D {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the temperature in fahrenheit ");
		int f=input.nextInt();
	
		
		double temperature=(f-32)*5/9;
		System.out.println("the degree celcius of given fahrenheit is"+temperature);
		input.close();
		


}
}