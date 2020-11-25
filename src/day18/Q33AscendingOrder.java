package day18;


import java.util.Scanner;

public class Q33AscendingOrder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter to size of an array");
		int size = input.nextInt();
		
		int[] arr = new int[size];

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the element of an array");
			
				arr[i]=input.nextInt();
			
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}}
			
		

		for (int i = 0; i < (arr.length-1); i++) {
			System.out.print(arr[i] + ",");
		}
		input.close();
	}
}



//  22 45 11 66 23