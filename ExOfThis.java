// java praccatice quesriton
// using this keyword

class ExOfThis{
	 
	int i ;
	void setvalue(int i){
		this.i = i; // refrence to an object
	}
	void show(){
		System.out.println("Hello from "+ i);
	}
}

class Test {
	public static void main(String[] args){
	
		ExOfThis t = new ExOfThis();
		t.setvalue(100);
		t.show();
	}
}