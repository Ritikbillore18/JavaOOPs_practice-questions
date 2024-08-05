//java practice questions 
class PolyExDiffType {
	
	
	void show(String a ) {
		System.out.println("Hello From 1");
	}
	void show(int b) {
		System.out.println("Hello from 2");
	}
	
	public static void main(String[] args){
			PolyExDiffType t = new PolyExDiffType();
			t.show("Ritik");
			t.show(20);
	}
}