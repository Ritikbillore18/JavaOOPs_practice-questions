// java practice questions 
// Initializing object by using Refrence Variable 

class InObjByRefernceVar {

		int age ;
		String color;
		
		public static void main(String[] args){
			InObjByRefernceVar buzo = new InObjByRefernceVar();
			buzo.color = "Black";
			buzo.age = 10;
			
			System.out.println(buzo.color + " " + buzo.age );
		}
}