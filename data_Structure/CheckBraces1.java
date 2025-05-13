package data_Structure;
//Ques :-Check parntheses in a given string
import java.util.*;
class CheckParenthesis{
	public void check() {
		Stack st = new Stack();
	
		String s = "[{()}]";
		int flag =0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch=='['||ch=='{'||ch=='(') {
				st.push(ch);
			}else {//it means in ch there is closing bracket
				if(!st.isEmpty()) {
					char top = (char)st.peek();
					if(ch ==')') {
						if(top!='(') {
							flag =1;
							break;
						}else {
							st.pop();
						}
					}
					if(ch =='}') {
						if(top!='{') {
							flag =1;
							break;
						}else {
							st.pop();
						}
					}
					if(ch ==']') {
						if(top!='[') {
							flag =1;
							break;
						}else {
							st.pop();
						}
					}
				}
			}
		}//this is the closing of for loop.
		if(flag ==0&&st.isEmpty()) {
			System.out.println("valid parenthesis");
		}else {
			System.out.println("invalid parenthesis");
		}
		//System.out.println(st);
	}
}

public class CheckBraces1 {

	public static void main(String[] args) {
		CheckParenthesis p = new CheckParenthesis();
		p.check();
	}

}
