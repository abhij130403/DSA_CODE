package data_Structure;
import java.util.*;
//Ques :- Two stack using one array
class TwoStack{
	int []ar = new int[10];
	int top1 = -1;//for first array
	int top2 = ar.length;//for second array
	void push1(int no) {
		if(top2==top1+1) {
			System.out.println("Stack is full");
		}else {
			top1++;
			ar[top1]=no;
		}
	}//end of push1
	void push2(int no) {
		if(top2==top1+1) {
			System.out.println("Stack is full");
		}else {
			top2--;
			ar[top2]=no;
		}
	}
	void pop1() {
		if(top1 ==-1) {
			System.out.println("Stack is empty");
		}else {
			System.out.println("deleted item :"+ar[top1]);
			top1--;
		}
	}
	void pop2() {
		if(top2==ar.length) {
			System.out.println("Stack is empty");
			
		}else {
			System.out.println("deleted item :"+ar[top2]);
			top2++;
		}
	}
	void traverse() {//printing the content of stack one
		for(int i=0;i<=top1;i++) {
			System.out.print(ar[i]+"\t");
		}
		for(int j=top2;j<ar.length;j++) {//printting the content of second array
			System.out.print(ar[j]+"\t");
		}
	}
}

public class TwoStackInOneArray {

	public static void main(String[] args) {
		TwoStack p = new TwoStack();
		p.pop1();
		p.pop2();
		p.push1(12);
		p.push1(78);
		p.push1(56);
		p.push1(67);
		p.push2(123);
		p.push2(567);
		p.push2(234);
		p.push2(456);
		p.traverse();
	}

}
