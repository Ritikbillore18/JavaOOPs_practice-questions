//java practice questions 
class Test {
	
	
	// void show(Object  a )

	void show (StringBuffer a){
		System.out.println("Hello From 1");
	}
	void show(String  a) {
		System.out.println("Hello from 2");
	}
	
	public static void main(String[] args){
			Test t = new Test();
			t.show("Ritik");
			t.show(new StringBuffer("ABC"));
			t.show (null);
		
			//t.show(20);  // void show(int a) it is work 
			
			//t.show('a');  // Automatic Promotion character in integer 
	}
}