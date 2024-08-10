// java practice questions 
// Map Interface practice 

import java.util.HashMap;
import java.util.Map;
class MapEX {
	public static void main(String[] args){
		
		Map m = new HashMap();
		
		m.put(101,"Nikhil");
		m.put(102,"Nikhil");
		m.put(101,"Rajesh"); // replace value from 101 
		m.put(103,"aaaaaaaaaa");
		m.put(104,"bbbbbbbbbbbbbb");
		
		//m. clear();
		
		System.out.println(m);
		System.out.println(m.containsKey(101));
		System.out.println(m.containsValue("nikhil"));
		
		System.out.println(m.get(103));
		System.out.println(m.remove(101));
		System.out.println(m);
		
	}
}