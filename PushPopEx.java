// java collection-frame work example 
// example of Stack class method 
// using #push and #pop

import java.util.Stack;

class PushPopEx{
	public static void main(String[] args){
		
		Stack s = new Stack();
		s.push(100);
		s.push(200);
		s.push("Pankaj");
		s.push("Nikhil");
		s.push(10.2);
		
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
	}
}