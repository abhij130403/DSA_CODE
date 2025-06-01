package Reccursion;

import java.util.Scanner;

class MySumDigit {
	void printSumDigit(int n,int sum) {
		if(n==0) {
			System.out.println("the sum of digit is :"+sum);
			return;
		}
		int d = n % 10;
		sum = sum + d;
		printSumDigit(n/10,sum);
	}
}

public class SumDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int n = sc.nextInt();
		MySumDigit s = new MySumDigit();
		int sum =0;
		//int n = 74625;
		s.printSumDigit(n, sum);
	}

}
