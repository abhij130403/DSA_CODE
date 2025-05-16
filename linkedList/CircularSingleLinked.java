package linkedList;
class Node{
	int no;
	Node next;
	Node(int no){
		this.no = no;
		this.next = null;
	}
}
class CircularLinkList{
	Node start = null;
	void insert(int no) {
		Node p = new Node(no);
		if(start == null) {//it means this is first node
			start = p;
			start.next =p;
		} else {
			Node temp;
			temp = start;
			
			while(temp.next != start) {
				temp = temp.next;
			}
			temp.next =p;
			p.next = start;
		}
	}
	void traverse() {
		if(start == null) {
			System.out.println("link list is empty");
		} else {
			Node temp = start;
			while(temp.next != start) {
				System.out.print(temp.no +"\t");
				temp = temp.next;
			}
		}
	}
}

public class CircularSingleLinked {

	public static void main(String[] args) {
		

	}

}
