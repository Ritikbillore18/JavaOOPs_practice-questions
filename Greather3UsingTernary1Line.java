// java Pracrtice program 
// find Greather three using ternary operator in one line 

import java.util.Scanner;

 public class Greather3UsingTernary1Line {
	
	public static void main (String[] args){
	
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter the First number");
		int a = sc.nextInt();
		System.out.println("Enter the First number");
		int b = sc.nextInt();
		System.out.println("Enter the First number");
		int c = sc.nextInt();
		
		int result = c > (a>b?a:b) ? c : (a>b?a:b);

		System.out.println(result + " is a Greather number  ");
	}	
}