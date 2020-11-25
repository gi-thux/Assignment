package day16;

public class Q28Function {

	public int findFactorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;

		}
		return fact;
	}

	public boolean isPrimeNumber(int n) {
		boolean isPrime = true;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}

	public void firstNthPrime(int n) {
		for (int i = 2; i <= n; i++) {
			if (isPrimeNumber(i)) {
				System.out.println(i + "");
			}
		}
		System.out.println();
	}
public void allPrimeBetween(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (isPrimeNumber(i)) {
				System.out.println(i + "");
			}

		}
	System.out.println();
	}

	public int  printSerieSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + (i / findFactorial(i));
		}
		return sum;

	}
}
