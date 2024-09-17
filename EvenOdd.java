// java practice program 
// Check the given number is even or odd

import java.util.Scanner;
public class EvenOdd {
	public static void main (String args[]){
			System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a%2==0)
		System.out.println("Number is Even");
		else
		System.out.println("Number is odd");
	}

}