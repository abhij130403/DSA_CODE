package Reccursion;
class MyArray{
	
	public void printArray(int []p,int index,int sum) {
		int psum=0;
		if(index == p.length) {
			System.out.println("sum is :"+sum);
			System.out.println("prime sum :" +psum);
			return ;
		}
		
		//int sum = sum + p[index];
		System.out.println(p[index]);
		sum = sum + +p[index];
		boolean b= true;
		
		for(int i=2;i<p[index]/2;i++) {
			if(p[index]%i==0) {
				b=false;
			}
			
		}
		if(b) {
			psum = psum+p[index];
		}
		printArray(p,index + 1,sum);
		//printArray(p,index + 1);

		
	}
}

public class Array {

	public static void main(String[] args) {
		int [] arr = {12,78,89,34,11};
		MyArray m = new MyArray();
		m.printArray(arr,0,0);

	}

}
