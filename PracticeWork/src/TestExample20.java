//Collection Q20
import java.util.*;

public class TestExample20 {
	
	public static Map<String,String> parseCapital(String input,String delimiter1, String delimiter2){
		Map<String,String> stateCapitalMap=new HashMap<>();
		String[] pairs=input.split(delimiter1);
		for(String s:pairs) {
			String[] stateCapital=s.split(delimiter2);
			stateCapitalMap.put(stateCapital[0], stateCapital[1]);
		}
		return stateCapitalMap;
	}
	
	
	public static void main (String[] args) {
		String input="tamilnadu||chennai-karanataka||bengaluru";
		Map<String,String> stateCapitalMap=parseCapital(input,"||","-");
		System.out.println(stateCapitalMap);
	}

}
