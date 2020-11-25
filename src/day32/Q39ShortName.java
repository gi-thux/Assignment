package day32;

//import java.util.Scanner;

public class Q39ShortName {
public static void main(String[] args) {
	/*
	 * Scanner input = new Scanner(System.in); System.out.println("enter the name");
	 * String abc=input.next();
	 */
	String abc="Sunny Bahadhur Chand";
	  String a=abc.substring(0,1);
	  String b=abc.substring(6,7);
	  String c=abc.substring(14,20);
	   System.out.println(a.concat(b).concat(c));
}
}