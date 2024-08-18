// Collection frame work practice questions 
// Example of Stack Class 

import java.util.Stack;

class StackEx {
	public static void main(String[] args){
		
		Stack s = new Stack();
		
		s.push(100);
		s.push(200);
		s.push("Pankaj");
		s.push("Nikhil");
		s.push(10.2);
		
		System.out.println(s);
	}
}