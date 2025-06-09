package data_Structure;
import java.util.*;

class MyRecursionStack{
	
	void pushBottom(Stack st,int no) {
		if(st.isEmpty()) {
			st.push(no);
			return;
		}
		int top = (int)st.peek();
		st.pop();
		pushBottom(st,no);
		st.push(top);
	}
}
public class RecursionStack {

	public static void main(String[] args) {
		MyRecursionStack rs = new MyRecursionStack();
		Stack st = new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		int no =100;
		System.out.println(st);
		rs.pushBottom(st,no);
		System.out.println(st);
	}

}
