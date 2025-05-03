package Practice_Queu;
//Ques 1 : implement a queue using an array
class MyQueue{
	int[] ar = new int[10];//allocated memory for 10 element 
	int front = -1;
	int rear = -1;
	public void enQueue(int no) {
		if(rear==ar.length-1) {
			System.out.println("Queue is full");
		}else {
			if(front ==-1 && rear == -1) {
				front =0;
				rear =0;
				
			}else {
				rear++;
			}
			ar[rear] = no;
		}
	}
	public void deQueue(){
		if(front == -1 && rear ==-1) {
			System.out.println("Queue is empty");
		}else {
			System.out.println("Deleted item "+ar[front]);
			if(front == rear) {
				front =-1;
				rear = -1;
			}else {
				front = front +1;
			}
		}
	}
	public void traverse() {
		if(front == -1 && rear ==-1) {
			System.out.println("Queue is empty");
		}else {
			for(int i=front;i<=rear;i++) {
				System.out.print(ar[i] +"\t");
			}
		}
	}
}

public class Arraqueue {

	public static void main(String[] args) {
		MyQueue mq = new MyQueue();
		mq.enQueue(12);
		mq.enQueue(45);
		mq.enQueue(23);
		mq.enQueue(56);
		
		mq.traverse();
		mq.deQueue();
		mq.traverse(); 
	}

}
