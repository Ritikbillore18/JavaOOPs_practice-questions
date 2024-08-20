// java using multiple inheritance archive in java 
// By using Interface 

interface I1 {
	void show();
}
interface I2 {
	void display();
}

class ExOfMultipleInheritance {

		public void show(){
			System.out.println("Hello from show");
		}
		
		public void display(){
			System.out.println("Hello from display");
		}
		public static void main(String[] args){
			
			ExOfMultipleInheritance ml = new ExOfMultipleInheritance();
			ml.show();
			ml.display();
		} 
}
