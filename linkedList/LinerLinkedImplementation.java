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
	public void deleteAtfirst() {
		if(start == null) {
			System.out.println("linklist is empty");
		} else {
			System.out.println("Deleted number" +start.no);
			start = start.next;
		}
	}
	public int nodeCount() {
		Node temp;
		temp = start;
		int count=0;
		while(temp != null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	public void deleteAtAnyLocation(int loc ) {
		int totalNode = nodeCount();
		if(loc>totalNode|| loc <1) {
			System.out.println("Invalid location......");
		} else if(loc ==1) {
			deleteAtfirst();
		} else if(loc == totalNode) {
			deleteAtLast();
		} else {
			Node temp ,temp1;
			temp = start;
			temp1 = start.next;
			for(int i =1;i<loc-1;i++) {
				temp = temp.next;
				temp1 = temp.next;
				
			}
			System.out.println("Deleted Element "+temp1.no);
			temp.next = temp1.next;
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
	public void deleteAtLast(){
		if(start == null) {
			System.out.println("LinkedList is empty");
		} else {
			if(start.next==null) {
				System.out.println("Delelted item" +start.no);
				start = null;
			} else {
				Node temp1,temp;
				temp = start;
				temp = start;
				temp1 = start.next;
				while(temp1.next != null) {
					temp1 = temp1.next;
					temp = temp.next;
				}
				System.out.println("Deleted item "+temp1.no);
				temp.next = null;
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
//		p.deleteAtfirst();
//		//mjjp.traverse();
		p.insert(45);
		p.insert(57);
		p.insert(34);
		p.insert(39);
		p.insert(78);
		p.insert(43);
		p.insert(12);
//		p.traverse();
//		p.deleteAtfirst();
		System.out.println("");
//		p.traverse();
//		p.insertAtBegining(20);
//		System.out.println();
//		p.traverse();
//		p.insertAtAnyLocation(75, 5);
//		System.out.println();
//		p.traverse();
	//	p.deleteAtLast();
		p.traverse();
		int totalNode =  p.nodeCount();
		System.out.println("the number of node is :"+totalNode);
		p.deleteAtAnyLocation(5);
		System.out.println("\n--------------");
		p.traverse();
		

	}

}
