package com.kodewala.mathProbelm;

public class MathAssignments {
	
//	static boolean numIsPrime(int num) {
//		int c = 0;
//		for(int i=2;i<num;i++) {
//			if(num % i == 0) {
//				return false;
//			}
//		}
//		return true;
//			
//	}
	
	static int gCD(int a , int b) {
		// gcd(a , b) == gcd(b , a%b); formula
		
		while(b != 0) {
			int temp = b;
			b = a% b;
			a = temp;
		}
		return a;
	}
	static int getLCM(int a , int b) {
		//formula = lcm = (a*b) / gcd;
		int gcd = gCD(a , b);
		int product = a*b;
		int lcm = product / gcd;
		return lcm;
	}

	static int checkPerfectNumber(int num) {
		int sum = 1;
		for(int i=2;i*i <= num;i++) {
			int firstNum = i;
			int second = num / i;
			sum += firstNum + second;
		}
		return sum;
	}
	public static void main(String[] args) {
		int num = 6;
//		boolean isPrime = numIsPrime(num);
//		int result = getLCM(12 , 18);
		int result = checkPerfectNumber(num);
		System.out.println(result == num);

	}

}
