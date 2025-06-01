package Reccursion;
class MySumEven{
	void printSumEven(int n,int sum) {
		if(n==0) {
			System.out.println("the sum of evenDigit is :"+sum);
			return;
		}
		int d = n/10;
		if(d % 2 ==0) {
			sum = sum + d;
		}
		
		printSumEven(n/10,sum);
	}
}
public class SumEven {

	public static void main(String[] args) {
		MySumEven a = MySumEven();
		int n = 76234;
		int sum = 0;
		s.printSumEven(n,sum);
	}

}
