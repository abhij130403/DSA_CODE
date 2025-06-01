package Reccursion;
class number{
	void sumNum(int num,int sum) {
		if(num<0) {
			System.out.println("the sum of number is :"+sum);
			return;
		}
		sum =  sum +num;
		sumNum(num-1,sum);
	}
}

public class SumNumber {

	public static void main(String[] args) {
		number n = new number();
		int num = 10;
		int sum = 0;
		n.sumNum(num, sum);

	}

}
