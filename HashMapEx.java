// java practice questions 
// HashMap example

import java.util.HashMap;
class HashMapEx{
	public static void main(String[] args){
		
		HashMap h = new HashMap();
		h.put(101,"Raj");
		h.put(102,"Rajesh");
		h.put(103,"kamlesh");
		h.put(104,"aditi");
		h.put(105,"Ramesh");
		h.put(null,null);h.put(106,null);
		
		System.out.println(h);
	}
}