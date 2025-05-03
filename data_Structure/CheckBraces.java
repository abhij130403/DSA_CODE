package data_Structure;

import java.util.Stack;

class Braces{
	public void check(String str) {
		int len = str.length();
		char top;
		Stack st = new Stack();
		for(int i=0;i<len;i++) {
			char ch = str.charAt(i);
			if(ch=='('||ch=='{'||ch=='[') {
				st.push(ch);
			}else {
				top = (char) st.peek();
				if(ch==')' && top=='('||ch=='}'&& top=='{'||ch==']' && top =='[') {
					st.pop();
				}else {
					break;
				}
			}
		}
		if(!st.isEmpty()) {
			System.out.println("Error in braces.");
		}else {
			System.out.println("Everything is fine.");
		}	
	}
}

public class CheckBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="{(()){}[]}";
		Braces b = new Braces();
		b.check(str);
	}
}
