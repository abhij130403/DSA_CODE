package Practice_Queu;
import java.util.*;
class Transferdata{
	Stack st = new Stack();
	Queue q = new LinkedList();
	q.offer(12);
	q.offer(67);
	q.offer(48);
	q.offer(69);
	System.out.print("Original Queue ");
	System.out.println(q);

   while(!q.isEmpty()) {
	 int front =(int) q.peek();
	 st.push(front);
	 q.poll();
}
}
public class StackToQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
