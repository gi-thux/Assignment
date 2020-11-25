package day19;

import java.util.Scanner;

public class Q34ReverseArray {
	public static void main(String[] args) {
		
	
	Scanner input = new Scanner(System.in);
	System.out.println("enter the size of an array");
	int size = input.nextInt();

	int [] arr= new int[size];for(
	int i = 0;i<arr.length;i++)
	{
		System.out.println("enter the element");
		arr[i] = input.nextInt();
	}

	System.out.println("Original order");

	for(
	int i = 0;i<arr.length;i++)
	{
		System.out.println(arr[i] + "");

	}System.out.println();
	System.out.println("reverse order");
	for(int i = (arr.length - 1);i>=0;i--)
	{
		System.out.println(arr[i] + " ");

		input.close();
	}

}}
