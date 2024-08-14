// java multithreading 
// By implementing Runnable Interface

class MultiThreadingExRunnablee implements Runnable{
	
	public void run(){
		for(int i=0;i<5 ; i++){
			System.out.println("Hello from Run");
		}
	}
}

class Test {
	
	public static void main(String[] args){
		MultiThreadingEx t = new MultiThreadingEx();
		Thread t1 = new Thread(t);
		t.start();
			for(int i=0; i<5 ; i++){
		System.out.println("Hello from Main");
			}
	}
}