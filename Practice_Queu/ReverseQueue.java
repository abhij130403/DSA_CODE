package Practice_Queu;
import java.util.*;
class Reverse{
	public void show() {
		Stack st = new Stack();
		Queue q = new LinkedList();
		q.offer(12);
		q.offer(67);
		q.offer(48);
		q.offer(69);
		System.out.print("Original Queue ");
		System.out.println(q);
		//queue to stack
	while(!q.isEmpty()) {
		int front =(int) q.peek();
		st.push(front);
		q.poll();
	}

	while(!st.isEmpty()) {
		int top = (int)st.peek();
		q.offer(top);
		st.pop();
	}
	System.out.println("reverse Queue");
	System.out.println(q);
}
}

public class ReverseQueue {

	public static void main(String[] args) {
		Reverse r  = new Reverse();
		r.show();

	}

}
