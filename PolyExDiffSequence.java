//java practice questions 
class PolyExDiffSequence {
	
	
	void show(String a , int b) {
		System.out.println("Hello From 1");
	}
	void show(int b , String a) {
		System.out.println("Hello from 2");
	}
	
	public static void main(String[] args){
			PolyExDiffSequence t = new PolyExDiffSequence();
			t.show("Ritik",20);
			t.show(20,"Ritik");
	}
}