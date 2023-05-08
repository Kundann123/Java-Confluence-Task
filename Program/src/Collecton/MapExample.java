package Collecton;
import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		Map<Integer,String> mp=new HashMap<>();
		mp.put(11, "rohit");
		mp.put(12, "veer");
		mp.put(13, "Abhi");
		//System.out.println(mp);
		
		Set s=mp.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
	}
//		mp.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);  
	}

}
