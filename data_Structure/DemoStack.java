package data_Structure;
import java.util.*;
class StackDemo{
	public void show(){
		Stack st = new Stack();//already made class in util package
		st.push(10);
		st.push(20);
		st.push(43);
		st.push(34);
		System.out.println(st);
		System.out.println("the top element is :  "+st.peek());
		st.pop();//delete top element
		System.out.println(st);
		if(st.isEmpty()) {
			System.out.println("no element in stack");
		}else {
			System.out.println("element is present");
		}
		
		int index = st.search(56);
		System.out.println("Element at :"+index);
		
	}
}

public class DemoStack {

	public static void main(String[] args) {
		
		StackDemo p = new StackDemo();
		p.show();
	}

}
