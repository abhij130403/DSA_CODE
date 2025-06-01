package Reccursion;
class AdvDigitSum{
	public int digitSum(int n) {
		if(n==0) {
			return n;
			
		}
		return n%10 + digitSum(n/10);
	}
}

public class AdvanceSumNum {

	public static void main(String[] args) {
		AdvDigitSum p = new AdvDigitSum();
		int result = p.digitSum(12345);
		System.out.println("the sum of number is :"+result);
	}

}
