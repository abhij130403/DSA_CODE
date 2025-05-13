package linkedList;
class Node{
	int no;
	Node next;
	  Node(int no) {
		this.no =no;
		this.next = null;
	}
}

class MyLinkList{	
	Node start =null;
	public void insert(int no) {
		Node p = new Node(no);
		if(start == null) {
			start = p;
		}else {
			Node temp = start;
			while(temp.next!=null) {
				temp = temp.next;
				
			}
			temp.next = p;
		}
	}
	public void insertAtBegining(int no) {
		Node p = new Node(no);
		if(start==null) {//it means there is no link list
			start =p;
		}else {
			p.next=start;
			start =  p;
			
		}
	}
	public void insertAtAnyLocation(int no , int loc) {
		Node p = new Node(no);
		Node temp = start;
		if(loc ==1) {
			insertAtBegining(no);
			
		}else {
			for(int i=1;i<loc-1;i++) {
				temp = temp.next;
				
			}
			p.next=temp.next;
			temp.next =p;
		}
	}
	public void traverse() {
		if(start == null) {
			System.out.println("LinkList is empty");
		}else {
			Node temp = start;
			while(temp!=null) {
				System.out.print(temp.no+"\t");
				temp = temp.next;
			}
		}
	}
//	int sum=0;
//	int count=0;
//	public void add() {
//		if(start == null) {
//			System.out.println("LinkList is empty");
//		}else {
//			
//			Node temp = start;
//			while(temp!=null) {
//				sum = sum + temp.no;
//				
//				temp = temp.next;
//			}
//			System.out.println("the sum of linklist element "+sum);
//		}
//	}
//	public void average() {
//		if(start == null) {
//			System.out.println("LinkList is empty");
//		}else {
//			sum=0;
//			Node temp = start;
//			while(temp!=null) {
//				sum = sum + temp.no;
//				count++;
//				temp = temp.next;
//			}
//			System.out.println("the average of linklist element "+(float)(sum/count));
//		}
//	}
	
	
}


public class LinerLinkedImplementation {

	public static void main(String[] args) {
		MyLinkList p = new MyLinkList();
		p.traverse();
		p.insert(45);
		p.insert(57);
		p.insert(34);
		p.insert(39);
		p.insert(78);
		p.insert(43);
		p.insert(12);
		p.traverse();
//		p.insertAtBegining(20);
		//System.out.println();
		//p.traverse();
		p.insertAtAnyLocation(75, 5);
		System.out.println();
		p.traverse();


	}

}
