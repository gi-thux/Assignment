package day10;

import java.util.Scanner;

public class Q25StudentWithHigestMarks {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter no of student");
		int numOfStudent=input.nextInt();
		
		int maxScore =0;
		String studentName="";
		
		for (int i=1; i<=numOfStudent; i++) {
			System.out.println("enter name of student");
			String name=input.next();
			System.out.println("enter score of student");
			int score=input.nextInt();
			if (score>maxScore) {
				maxScore =score;
				studentName=name;
			}}
		System.out.println("student name is"+studentName);
		System.out.println("max score is"+maxScore);
		input.close();
			}
		}
	