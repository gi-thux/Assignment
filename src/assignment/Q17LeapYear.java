package assignment;

import java.util.Scanner;

public class Q17LeapYear {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("enter a year to check if it is leap year");
		int i= input.nextInt();
		 /*int a=i%4;
	 int b=i/4;
		 int c=b/100;
    int d=b/400;*/
		 if (i%4==0 || i%100==0) {System.out.println("the given year "+ i+ " is a leap year");}
		 else {System.out.println("the given year is not a leap year");
			 
		 /*int b=i/4 ;} 
		 if(b==0) {
			 int c=b/100;}
		 
		 }
		 
		int b=i/4;
		*/
		
	}
		 input.close();

}}

