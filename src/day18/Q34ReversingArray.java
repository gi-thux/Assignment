package day18;

import java.util.Scanner;

public class Q34ReversingArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter to size of an array");
		int size = input.nextInt();
		int[] arr = new int[size];

		//int temp = 0;

		System.out.println("enter the numbers");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}

		
	
		 for (int i =( arr.length-1); i >= 0; i--) { System.out.print(arr[i] + ","); }
		 /*int temp=0;
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
               if(arr[i]==arr[j]) {
               temp=arr[i];
              
				
				  arr[i]=arr[j]; arr[j]=temp;
				 
               
               
			}
			}}
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+", ");
			
		
		
		System.out.println(arr[arr.length-2]);
*/		
		
		
		input.close();
		
		
	}
}
