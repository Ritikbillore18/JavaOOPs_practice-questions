// java practice questions 
// Initializing object by using Method 

class InObjByMethod {

		int age ;
		String color;
		
		void inObj(String c ,int a){
			age = a;
			color = c;
		}
		
		void display(){
			System.out.println(color + " " + age);
		}
		
		public static void main(String[] args){
		
			InObjByMethod buzo = new InObjByMethod();
			buzo.inObj("Black",10);
			buzo.display();
		}
}