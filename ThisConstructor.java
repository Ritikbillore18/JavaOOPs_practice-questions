// java constructor example call by this keyword

class ThisConstructor {
	
	ThisConstructor(){
		System.out.println("No argument Constructor");
	}
	
	ThisConstructor(int a){
		this();
		System.out.println("Parameterise Constructor");
		}
		
	public static void main(String[] args){
	
		ThisConstructor tc = new ThisConstructor(10);
		
	}
}