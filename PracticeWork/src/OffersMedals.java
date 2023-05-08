//Collection Q17

import java.util.*;

public class OffersMedals {
	public static void main(String[] args) {
		HashMap<Integer,Integer> hm=new HashMap<>();
		hm.put(10,90);
		hm.put(11,75);
		hm.put(12,81);
		hm.put(56,36);
		System.out.println(hm);
		
		
		for(Map.Entry<Integer, Integer> mapValue : hm.entrySet()) {
			if(mapValue.getValue() >= 90) {
				System.out.println(mapValue.getKey()+":" +"Gold" );
			}
			else if(mapValue.getValue()>=80 && mapValue.getValue()<90) {
				System.out.println( mapValue.getKey()+":"+"Silver");
			}
			else if(mapValue.getValue()>=70 && mapValue.getValue()<80) {
				System.out.println(mapValue.getKey()+":"+ "Bronze");
			}
			else {
				System.out.println(mapValue.getKey()+":" +"No Medal" );
			}
		}
	}

}
