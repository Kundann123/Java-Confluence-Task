import java.util.*;
import java.util.Map.Entry;
public class Test {
	public static void main(String[] args) {
		Map<String,Integer> lm=new LinkedHashMap<>();
		lm.put("SUV",10);
		lm.put("BMW",7);
		lm.put("Thar",8);
		System.out.println(lm);
		
		System.out.print("Select: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		for(Map.Entry<String, Integer> map:lm.entrySet()) {
			if(map.getKey().equals(str)) {
				map.setValue(map.getValue()-1);
			}
		}
		System.out.println(lm);
	}

}
