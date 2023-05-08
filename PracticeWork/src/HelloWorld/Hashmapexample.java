//Collection Q16

package HelloWorld;
import java.util.*;
import java.util.Map.Entry;

public class Hashmapexample {
	public static void main(String[] args) {
		HashMap<String,Double> hm=new HashMap<>();
		hm.put("selva",(double) 75.6f);
		hm.put("abi",(double) 89.5f);
		hm.put("ram",(double) 40);
		System.out.println(hm);
		
		for(Map.Entry<String, Double> mp:hm.entrySet()) {
			if(mp.getValue()>60) {
				System.out.println(mp.getKey()+":" +"Pass");
			}
			else {
				System.out.println(mp.getKey()+":" +"Fail");
			}
		}	 	 
	}
}
