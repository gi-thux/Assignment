package assignment;

import java.util.Scanner;
public class Q9Pounds2Kg {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the weight in pounds");
		float pounds=input.nextFloat();
		double kg=pounds*0.454;
		System.out.println("the weight of given pounds in kg is "+kg);
		input.close();
	}

}
