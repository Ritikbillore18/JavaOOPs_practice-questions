//java practice questions 
class PolyMultiMain {
	
	
	void show(String a ) {
		System.out.println("Hello From 1");
	}
	void show(int a) {
		System.out.println("Hello from 2");
	}
	
	public static void main(String[] args){
			PolyMultiMain t = new PolyMultiMain();
			t.show("Ritik");
			t.show(20);
			t.show('a');
	}
}