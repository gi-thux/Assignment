package day18;

import java.util.Scanner;

public class Q36DublicateNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter to size of an array");
		int size = input.nextInt();
		int[] arr = new int[size];

		

		System.out.println("enter the numbers");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
int count =0;
System.out.println("the dublicate element");
		for (int i = 0; i < arr.length; i++) {
			for (int j =i+ 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
			System.out.println(arr[j]+" ");
			count ++;
				}
			}
			
		}
		
if(count ==0) {
		
			System.out.print("no duplicate element");
		}
input.close();
}
}