package assignment;

import java.util.Scanner;

public class Q15Ascii {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("enter a number between 0 and 128");
			int n= input.nextInt();
			
			if(n>=0 && n<=128) {
				char c=(char)n;
				System.out.println("corresponding ASCII code is:" + c);}
			else {System.out.println("you have entered invalid number");
				
			}
			input.close();
		}

	}



