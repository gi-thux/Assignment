package day18;

import java.util.Scanner;

public class Q32ArraySum {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size = input.nextInt();
		int [] arr= new int[size];
		for(int i=0; i<arr.length;i++) {
			System.out.println("enter the element");
			arr[i]=input.nextInt();}
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
		sum=sum+arr[i];
		
		}
		System.out.println("sum of an array element is "+sum);
		
		
		input.close();
	}
}