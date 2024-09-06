// ArrayList in java 

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListLearn {
	public static void main(String[] args){
	  Scanner in = new Scanner(System.in);
	  
  	  ArrayList<Integer> list = new ArrayList<Integer>();
	/*	list.add(43);
		list.add(33);
  		list.add(48);
		list.add(37);
		list.add(41);
		System.out.println(list);

	// to set any index of any value (using set() method)
		list.set(0,1);
		System.out.println(list); 
	// to remove any value of list (using remove() method)
		System.out.println(list.remove(3));
		System.out.println(list); 


	// to check how to contain 48  no (using contain method) is found return true
		System.out.println(list.contains(48));		*/

	// take a input using itreator 
		for(int i=0;i<5;i++){
			list.add(in.nextInt());
		}
	
	// output the list  
		for(int i=0;i<5;i++){
			System.out.println(list.get(i));
		}
	

	}


}