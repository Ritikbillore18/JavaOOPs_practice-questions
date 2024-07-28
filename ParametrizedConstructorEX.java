// Parametrized  Constructor Example 

public class ParametrizedConstructorEX {
			
		int id ;
		String name;
		
		ParametrizedConstructorEX(String name , int id){
			this.name = name;
			this.id = id;
		}
		public static void main(String[] args){
			 
			ParametrizedConstructorEX pc = new ParametrizedConstructorEX("Pradeep",101);
			ParametrizedConstructorEX pc1 = new ParametrizedConstructorEX("Pankaj",102);
			
			System.out.println(pc.name + " " + pc.id);
			System.out.println(pc1.name + " " + pc1.id);
			
			System.out.println("Print values by parameterized constructor");
		}
}