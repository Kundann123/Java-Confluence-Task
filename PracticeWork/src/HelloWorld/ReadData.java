//Collection Q1

package HelloWorld;
import java.util.*;

public class ReadData {
	public static void main(String[] args) {
		Map<Integer,String> map=new LinkedHashMap<>();
		map.put(100,"Car");
		map.put(56,"Bike");
		map.put(33,"Plane");
		System.out.println(map);
		
		
		Set<Integer> set=new HashSet<>();
		set.add(26);
		set.add(28);
		set.add(23);
		System.out.println(set);
		
		List<String> list=new ArrayList<>();
		list.add("MH");
		list.add("MP");
		list.add("UP");
		list.add("HYD");
		System.out.println(list);
	}
	

}
