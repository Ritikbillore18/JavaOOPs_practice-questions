// why we need constructor in java 

public class ConstructorEx{
			
		int emp_id;	  //instance variable  	// default value is initialize 
		String name;  //instance variable	// default value is initialize

			ConstructorEx(String name , int emp_id){  // Parameterize Constructor
				this.name = name;
				this.emp_id = emp_id;
			}
	
		public static void main (String[] args){
			
			// printing values by using constructor
			
			ConstructorEx n1 = new ConstructorEx("Pradeep",101);  
			ConstructorEx n2 = new ConstructorEx("Pankaj",102);
			System.out.println("HEY!");
			System.out.println(n1.name + " " + n1.emp_id);
			System.out.println(n2.name + " " + 	n2.emp_id);

		}
}