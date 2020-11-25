package assignment;


	import java.util.Scanner;
	public class Q11aSwapNumbers {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("enter a number a:");
			float a= input.nextFloat();
			System.out.println("enter a number b:");
			float b= input.nextFloat();
			System.out.println("the number a before swapping is  "  +a);
			System.out.println("the number b before swapping is  "  +b);
			float temporary = a;
			a=b;
			b = temporary ;
			
			System.out.println("the number a after swapping is"  +a);
			System.out.println("the number b after swapping is"  +b);
			input.close();
			
		}
	  
	
}
