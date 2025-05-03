package data_Structure;
import java.util.*;
class Stackrev{
	public void reverse() {
		String s = "Abhijeet";
		String rev = " ";
		Stack st = new Stack();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			st.push(ch);
		}
		while(st.isEmpty()) {
			char top = (char)st.peek();
			rev = rev + top;
			st.pop();
		}
		System.out.println(st);
		System.out.println("the reverse of given element :"+rev);
	}
}

public class StackReverse {

	public static void main(String[] args) {
		
		Stackrev sr = new Stackrev();
		sr.reverse();
	}

}
