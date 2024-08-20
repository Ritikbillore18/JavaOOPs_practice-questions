// java practice program using abstraction class 
// program of Abstraction 

abstract class Vehicle {
	
	abstract void start();
}

class Car extends Vehicle {
	void start(){
	System.out.println("Start with Key ");
	}
}

class Scooter extends Vehicle {
	void start(){
	System.out.println("Start with Kick");
	}
	
	public static void main(String args[]){
		//Vehicle v = new Vehicle();
		
		Car c = new Car();
		c.start();
		
		Scooter s = new Scooter();
		c.start();
	}
}