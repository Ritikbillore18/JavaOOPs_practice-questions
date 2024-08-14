// java multithreading 
// By impllimenting Runnable Interface

class MultiThreadingExRunnable impliments Runnable{
	
	public void run(){
		for(int i=0;	 i<5 ; i++){
			System.out.println("Hello from Run");
		}
	}
}

class Test {
	
	public static void main(String[] args){
		MultiThreadingEx t = new MultiThreadingEx();
		Thread(t);
		Thread t1 = new Thread();
		t.start();
			for(int i=0;	 i<5 ; i++){
		System.out.println("Hello from Main");
			}
	}
}