package Practice_Queu;
import java.util.*;
class yQueue{
	public void show() {
		Queue q = new LinkedList();
		q.offer(12);
		q.offer(67);
		q.offer(48);
		q.offer(69);
		System.out.println(q);
		if(q.isEmpty()) {
			System.out.println("queue is empty");
		}else {
			System.out.println("Queue is not empty");
		}
		int front = (int)q.peek();
		System.out.println("front :" +front);
		q.poll();
		System.out.println(q);
		q.remove();
		System.out.println(q);
		q.remove();
		q.remove();
		if(q.isEmpty()) {
			System.out.println("queue is empty");
		}else {
			System.out.println("Queue is not empty");
		}
		//q.poll();
		//q.remove();
	}
}
public class Function {

	public static void main(String[] args) {
		yQueue p = new yQueue();
		p.show();

	}

}
