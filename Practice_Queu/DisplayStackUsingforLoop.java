package Practice_Queu;
import java.util.*;
//ques :-wap to display all the element of stack using for loop
class MyStackPrint{
	public void show() {
		Stack st = new Stack();
		st.push(45);
		st.push(67);
		st.push(53);
		st.push(25);
		System.out.println(st);
		for(int i=0;i<st.size();i++) {
			System.out.print(st.get(i)+"\t");
		}
		System.out.println("");
		System.out.println("reverse Stack");
		for(int i=st.size()-1;i>=0;i--) {
			System.out.print(st.get(i)+"\t");
		}
		
	}
	
}
public class DisplayStackUsingforLoop {

	public static void main(String[] args) {
		MyStackPrint mp = new MyStackPrint();
		mp.show();
	}

}
