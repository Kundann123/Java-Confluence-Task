//Collection Q3

package HelloWorld;
import java.util.*;

public class MapCountries {
	public static void main(String[] args) {
		Map<String,String> mp=new HashMap<>();
		mp.put("Bhutan","Thimphul");
		mp.put("Bangladesh","Dhaka");
		mp.put("China","Beijing");
		mp.put("Bulgeria","Sofia");
		mp.put("France","Paris");
		
		System.out.println("iterator foreach");
		mp.forEach((k,v)->System.out.println("Country:"+k+" "+"Capital:"+v));
		
		System.out.println("entryset iterator along with foreach");
		for(Map.Entry<String, String> m : mp.entrySet()) {
			System.out.println("Country: "+m.getKey()+" "+"Capital: "+m.getValue());
		}
		
		System.out.println("keyset iterator");
		for(String Country:mp.keySet()) {
			System.out.println("Country: "+Country);
		}
		for(String Capital:mp.values()) {
			System.out.println("Capital: "+Capital);
		}
		
		System.out.println("EntrySet along with Java iterator");
		Iterator<Map.Entry<String, String>> itr = mp.entrySet().iterator();
		while (itr.hasNext()) {
		    System.out.println(itr.next());
		}
	}

}
