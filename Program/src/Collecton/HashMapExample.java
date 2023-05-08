package Collecton;
import java.util.*;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(10,"Mari");
		map.put(15,"Marine");
		map.put(16,"Marigold");
		map.put(12,"Marii");
		//System.out.println(map);
		
		Set s=map.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		map.putIfAbsent(13, "Mari");
		System.out.println(map);
	}

}
