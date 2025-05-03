package Practice_Queu;
import java.util.*;
//ques : implement a queue using two Stack.
class QueueusingtwoStack{
	Stack st1 = new Stack();
	Stack st2 = new Stack();
	public void enQueue(int no) {
		st1.push(no);
	}
	public void deQueue() {
		if(st2.isEmpty()) {
			if(st1.isEmpty()) {
				System.out.println("Queue is empty");
			} else {//we are going to bring all the elment of stack1 to stack2
				while(!st1.isEmpty()) {
					int top = (int)st1.peek();
					st2.push(top);
					st1.pop();
				}
				st2.pop(); 
			}
		}else {
			st2.pop();
		}
	}
	public void traverse() {
		if(st1.isEmpty()&&st2.isEmpty()) {//case 1
			System.out.print("Queue is empty");
		} else {
			if(st2.isEmpty()) {
				//case 2
				for(int i=0;i<st1.size();i++) {
					System.out.print(st1.get(i)+"\t");
				}
			}else {
				for(int i=st2.size()-1;i>=0;i--) {
					System.out.print(st2.get(i)+"\t");
				}
				for(int i=0;i<st1.size();i++) {
					System.out.print(st1.get(i)+"\t");
				}
				
			}
			
		}
	}
}

public class TwoStackQueue {

	public static void main(String[] args) {
		QueueusingtwoStack p = new QueueusingtwoStack();
		p.traverse();
		p.deQueue();
		p.enQueue(10);
		p.enQueue(56);
		p.enQueue(45);
		p.enQueue(59);
		p.traverse();
		p.deQueue();
		System.out.println("");
		p.traverse();

	}

}
