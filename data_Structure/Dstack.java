package data_Structure;
class Node{
	int no;
	Node next;
	Node(int no){
		this.no =no;
		this.next = null;
	}
}

class MyStack{
	Node top = null;
	void push(int no) {
		Node p = new Node(no);
		if(top == null) {//iska mtlab bnne wala node phela node hai aur yahi last node bhi h
			top = p;
		}
		else {
			p.next = top;
			top = p;
		}
	}
	public void traverse(){
        Node temp;
        if(top == null){
            System.out.println("Stack is empty");
        }else{  
            temp = top;
            while(temp != null){
            System.out.print(temp.no + "\t");
            temp = temp.next;
            }
        }
    }

    public void pop(){
        if(top == null){
            System.out.println("Stack is empty, unable to delete");
          }else{
            System.out.println("Deleted No : " + top.no);
            top = top.next;
          }
    }
}
public class Dstack {

	public static void main(String[] args) {
		   MyStack m = new MyStack();
           m.push(10);
           System.out.println("Insert 10 Successfully");
           m.push(20);
           System.out.println("Insert 20 Successfully");
           m.push(30);
           System.out.println("Insert 30 Successfully");
           m.push(40);
           System.out.println("Insert 40 Successfully");
           m.push(50);
           System.out.println("Insert 50 Successfully");

           m.traverse();
           System.out.println("\nElements Print Successfully");
           m.pop();
           m.traverse();
           System.out.println("\nElements Print After Deletion Perform");
	}

}
