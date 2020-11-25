package day10;

import java.util.Scanner;

public class Q20SwitchOperator {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Chose the operator -,+,*,/");
		char operator = input.next().charAt(0);
		System.out.println("enter a number a");
		int a = input.nextInt();
		System.out.println("enter second number b");
		int b = input.nextInt();
  switch(operator){
  case '-':
		int sub = a-b;
		System.out.println("the subtraction of a and b is: "+sub);
		break;
		
		case '+':
		int add= a+b;
		System.out.println("the addition of a and b is: "+add);
		break;

		case '*':
		int mul= a*b;
		System.out.println("the multiplication of a and b is: "+mul);
		break;
		
		case '/':
		int div=a/b;
		System.out.println("the division of a and b is: "+div);
		break;
		
		default:
		System.out.println("the operator is invalid");
		break;
		}
		
		System.out.println("other code");
		System.out.println("the programme closed");
		
		
			input.close();
	}



	}


