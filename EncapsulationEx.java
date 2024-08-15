// java example of Abstraction 

class EncapsulationEx {
		private int i ;
		
		public void setI(int i1){
			i = i1;
		}
		public int getI(){
			return i;
		}
}

class Test {
		public static void main(String[] args){
			EncapsulationEx e = new EncapsulationEx();
			e.setI(50);
			System.out.println(e.getI());
		}
}