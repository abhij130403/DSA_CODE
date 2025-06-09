package Reccursion;
class MyFib{
	public int fib(int n) {
		if(n<2) {
			return n;
		}
		return fib(n-1) +fib(n-2);
	}
}

public class Fibnoci {

	public static void main(String[] args) {
		MyFib f = new MyFib();
		int t= f.fib(50);
		System.out.println(t);
	}

}
