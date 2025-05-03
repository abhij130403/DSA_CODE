package data_Structure;
//ques :- Static implementation of stack
class DpStak{
	int []ar = new int[10];
	int top = -1;
	public void push(int no) {
		if(top == ar.length-1) {
			System.out.println("stack is full");
		}
		else {
			top++;
			ar[top] = no;
		}
	}
	
	public void traverse() {
		if(top == -1) {
			System.out.println("Stack is empty");
			
		}
		else {
			for(int i=top;i>=0;i--) {
				System.out.print(ar[i] + "\t");
			}
		}
	}
	public void pop() {
		if(top ==-1) {
			System.out.println("stack is empty");
			
		}
		else {
			System.out.println();
			System.out.println("Deleted item "+ ar[top]);
			top--;
		}
	}
	public int peek() {
		return ar[top];
	}
}
public class TStack {

	public static void main(String[] args) {
		DpStak s = new DpStak();
		s.pop();
		s.push(10);
		s.push(20);
		s.push(30);
		
		s.push(40);
		
		System.out.println("the stored data inside the stack");
		
		s.traverse();
		
		s.pop();
		
		System.out.println("After pop operation");
		s.traverse();
		
		int a = s.peek();
		System.out.println();
		System.out.println("top element : "+a);

	}

}
