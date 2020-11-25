package day16;



public class Q28ClassWithFunction {

public boolean  isPrimeNumber(int n) {
	
		boolean isPrime = true;
		for (int i = 2; i <= n ; i++) {
			
			if(n%i==0) {
				isPrime= false;
				}}
			return isPrime;
			}
	
	public void nthPrimeNumber(int n) {
		for (int i = 2; i <=n; i++) {
			if(isPrimeNumber(i)) {
			System.out.println(i);
			}
			
		}
	}
		
	public void primeNumberBetween(int start, int end) {
		for (int i = start; i <=end; i++) {
			if(isPrimeNumber(i)) {
			System.out.println(i+"");
			}
			
		}
	}
	
	public int findFactorial(int n) {
		int fact =1;
		for (int i = 1; i <=n; i++) {
			fact=fact*i;
			}
		return fact;
	}
	
	public int sumSeries(int n) {
		int sum=0;
		for (int i = 1; i <n; i++) {
			sum=sum+(i/findFactorial(i));
		}
return sum;			
		}
	
	
}



	/*
	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.println("enter a number to check if it is a prime number");
	 int a=input.nextInt();
	 //int b=0;
	for (int i = 2; i <=a/2; i++) {
		if(a%i==0) {
	int  b =0;
		b=b+1;
	if (b==2) {	System.out.println("the"+a+"is  not a prime number");
		}
	
	  else { System.out.println("the"+a+"is  a prime number"); }
	}
	input.close();
	}}

*/