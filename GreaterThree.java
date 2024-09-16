 // java Practice questions 
 // Find the maximum of three number 
 
 import java.util.Scanner;
 public class GreaterThree {
	
	public static void main (String[] args){
	
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter the First number");
		int a = sc.nextInt();
		System.out.println("Enter the First number");
		int b = sc.nextInt();
		System.out.println("Enter the First number");
		int c = sc.nextInt();
		
		System.out.println("Enter the First number");
		
		if (a>b && a>c )
		System.out.println("A is Greather ");
		
		else if(b>a && b>c)
		System.out.println("B is Greather ");
		
		else 
		System.out.println("C is Greather ");
		
	}
 }