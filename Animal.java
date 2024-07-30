// java practice program 
// creation object and use 

class Animal{

		public void run(){
			System.out.println("I am Runnning");
		}
		
		public static void main(String[] args){
		
			Animal buzo = new Animal();
			buzo.run();
			buzo.eat();
			Bird bird = new Bird();
			bird.fly();
	}	
	public void eat(){
				System.out.println("I am Eating");
		}
}
class Bird {
		public void fly(){
			System.out.println("I am Fly");
		}
}