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
		p.traverse();
		p.insertAtBeg(23);
		System.out.println("");
		p.traverse();
	}

}
