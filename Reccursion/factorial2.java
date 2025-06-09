package Reccursion;
class MyFact{
	public int fact(int n) {
		if(n==0) {
			return 1;
		}
		return n * fact(n-1);
	}
}

public class factorial2 {

	public static void main(String[] args) {
		MyFact f = new MyFact();
		int sum = f.fact(5);
		System.out.println(sum);

	}

}
