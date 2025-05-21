package double_Link_List;
//Ques - creating Double linklist and there all operation
class Node{
	int no;
	Node next;
	Node prev;
	Node(int no){
		this.no=no;
		this.next = null;
		this.prev = null;
	}
}

class myDoubleLinkList{
	Node start = null;
	public void insert(int no) {
		Node p = new Node(no);
		if(start == null) {
			start = p;
		} else {
			Node temp;
			temp = start;
			while(temp.next != null) {
				temp = temp.next;
			}
			p.prev = temp;
			temp.next = p;
		}
	}
	//inserting the element at the begging of the linked list;
	public void insertAtBeg(int no) {
		Node p = new Node(no);
		if(start == null) {
			start = p;
		} else {
			start.prev = p;
			p.next = start;
			start = p;
		}
	}
	public void insertAtAnyPosition(int no,int loc) {
		int count = nodeCount();
		if(loc>count+1) {
			System.out.println("Invalid Location ");
		} else {
			
			if(loc==1) {
				insertAtBeg(no);
			} else if(loc == count +1) {
				insert(no);
			} else {
				Node p = new Node(no);
				Node temp,temp1;
				temp = start;
				temp1 = start.next;
				for(int i=1;i<loc;i++) {
					temp1 = temp1.next;
					temp = temp.next;
					
				}
				temp.prev = p;
				p.prev = temp;
				p.next = temp1;
				temp.next = p;
			}
		}
		
	}
	public int nodeCount() {
		int count = 0;
		Node temp = start;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	public void deleteAtFirst() {
		if(start ==  null) {
			System.out.println("Link List is empty");
		} else {
			System.out.println("Deleted item :"+start.no);
			start = start.next;
			start.prev = null;
		}
	}
	
	public void traverse() {
		if(start == null) {
			System.out.println("Link list os Empty");
		} else {
			Node temp = start;
			System.out.println("In forward dirction.............");
			while(temp.next != null) {
				System.out.print(temp.no+"\t");
				temp =temp.next;
			}
			System.out.print(temp.no);
			System.out.println("---------------------------------------");
			while(temp.prev != null) {
				System.out.print(temp.no+"\t");
				temp = temp.prev;
			}
			System.out.print(temp.no);
		}
	}
}
public class DoubleLinkList {

	public static void main(String[] args) {
		myDoubleLinkList p = new myDoubleLinkList();
		p.insert(10);
		p.insert(56); 
		p.insert(46);
		p.insert(43);
		p.insert(34);
		p.insert(38);
		p.insert(90);
		p.traverse();
		//p.insertAtBeg(23);
		System.out.println("");
		//p.traverse();
		p.insertAtAnyPosition(11, 5);
		System.out.println("");
		p.traverse();
		System.out.println("After Deletion........");
		p.deleteAtFirst();
		
	}

}
