//java practice questions 
class Test {
	
	
	void show(Object  a ) {
		System.out.println("Hello From 1");
	}
	void show(int a) {
		System.out.println("Hello from 2");
	}
	
	public static void main(String[] args){
			Test t = new Test();
			t.show("Ritik");
			t.show(20);
			t.show('a');  // Automatic Promotion character in integer 
	}
}