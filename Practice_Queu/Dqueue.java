package Practice_Queu;
//ques 2: Dynamic implementation  of queue.
class Node{
	int no;
	Node next;
	Node(int no){
		this.no =no;
		this.next =null;
	}
}
class DynamicQueue{//insert in queue
	Node front = null;
	Node rear = null;
	public void enQueue(int no) {
		Node p = new Node(no);
		if(front == null && rear == null) {
			front = p;
			rear = p;
		}else {
			rear.next =p;
			rear =p;
		}
	}
	public void deQueue(){//to delete an element;
		if(front == null&&rear ==null) {
			System.out.println("Queue is empty");
		}else {
			System.out.println("Deleted Item ::"+front.no);
			if(front == rear) {
				front = null;
				rear = null;
			}else {
				front = front.next;
			}
		}
	}
	public void traverse(){
		if(front == null&&rear ==null) {
			System.out.println("Queue is empty");
		}else {
			Node temp;
			temp = front;
			while(temp != null) {
				System.out.print(temp.no +"\t");
				temp = temp.next;
			}
		}
	}
	public void sumAllElement()
	{
		int sum = 0;
		Node temp = front;
		while(temp!=null) {
			sum = sum + temp.no;
			temp = temp.next;
		}
		System.out.print("the sum of all element :"+ sum);
	}
	public void greatestElement() {
		int max = front.no;
		Node temp = front;
		while(temp !=null) {
			if(temp.no > max) {
				max = temp.no;
			}
			temp = temp.next;
		}
		System.out.println("greatest element "+max);
	}
	public void primeNumber() {
		Node temp = front;
		while(temp != null) {
			int i;
		for( i=2;i<Math.sqrt(front.no);i++) {
			 if (front.no % i == 0) {
				 break;
			 }
			
		}
		if(i==Math.sqrt(front.no)-1) {
			System.out.println(front.no +"\t");
		}
		 temp = temp.next;
		 
	}
		
	}
}
public class Dqueue {

	public static void main(String[] args) {
		DynamicQueue q = new DynamicQueue();
		q.traverse();
		q.deQueue();
		q.enQueue(10);
		q.enQueue(67);
		q.enQueue(56);
		q.enQueue(34);
		q.traverse();
		q.deQueue();
		System.out.println("");
		q.traverse();
		q.sumAllElement();
		q.greatestElement();
		q.primeNumber();
	}

}
