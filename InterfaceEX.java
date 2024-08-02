// Practice question if java 

interface I1 {
		void show();
		static void display(){
		}
		default void display1(){
		
		}
}
class  InterfaceEX implements I1{
		
		public void show(){
			System.out.println("1");
		} 
		
		public static void main(String[] args){
			InterfaceEX i = new InterfaceEX();
			i.show();
		}
}
