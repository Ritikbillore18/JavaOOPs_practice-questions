// why we need constructor in java 

public class NotConstructor{
			
		int emp_id;	  //instance variable  	// default value is initialize 
		String name;  //instance variable	// default value is initialize 
	
		public static void main (String[] args){
			
			// printing values by using methods
			
			NotConstructor n1 = new NotConstructor();  
				n1.name = "Pankaj"; n1.emp_id = 101;
			
			NotConstructor n2 = new NotConstructor();
				n2.name = "Pradeep"; n2.emp_id = 102;
			
			System.out.println("HEY!");
			System.out.println(n1.name + " " + n1.emp_id);
			System.out.println(n2.name + " " + 	n2.emp_id);
		}
}