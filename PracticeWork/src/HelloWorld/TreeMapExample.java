//Collection Q8

package HelloWorld;
import java.util.*;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(1,"Kumar");
		tm.put(2,"Shree");
		tm.put(3,"Suhas");
		
		for(Map.Entry<Integer,String> m:tm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
