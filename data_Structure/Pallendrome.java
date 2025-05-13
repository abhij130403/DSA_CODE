package data_Structure;
//ques:-check pallendrome
import java.util.*;
class CheckPalindrome{
	public void check(String s1) {
		Stack st = new Stack();
		String s = s1;  //"racecar"
		int hlen = s.length()/2;
		System.out.println("the lenght of string :"+hlen);
		for(int i=0;i<hlen;i++) {
			char ch = s.charAt(i);
			st.push(ch);
		}
		System.out.println(st);
		
		for(int i=hlen+1;i<s.length();i++) {
			char ch = s.charAt(i);
			char top = (char)st.peek();
			if(ch==top) {
				st.pop();
			}
			
		}
		if(st.isEmpty()) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
	}
}

public class Pallendrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sting :");
		String s1 = sc.next();
		CheckPalindrome cp = new CheckPalindrome();
		//cp.check();
		cp.check(s1);
	}

}
