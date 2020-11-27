package day32;

import java.util.Scanner;

public class Q41DuplicateLetter {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the word");
		String abc = input.next();
	
		char [] arr=abc.toCharArray();
		String a="";
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {

				if(arr[j]==(arr[i])) {
					a=a+arr[j];
					
				}
			}
			
		
		}
		System.out.println("the duplicate letters in the word are: "+a);
input.close();
	


}}