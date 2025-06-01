package Reccursion;

import java.util.Scanner;
class facto{
	void fact(int num,int pro) {
		if(num<0) {
			System.out.println("the factorial is :"+pro);
			return;
		}
		pro = pro *num;
		fact(num-1,pro);
	}
}

public class Factorial {

	public static void main(String[] args) {
		facto f = new facto();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int pro=1;
		f.fact(num,pro);

	}

}
