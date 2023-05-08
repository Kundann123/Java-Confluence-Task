//Collection Q13

package HelloWorld;
import java.util.*;

public class SynchronizeArraylist {
	public static void main(String[] args) {
		List<Integer> Al=Collections.synchronizedList(new ArrayList<>());
		Al.add(10);
		Al.add(20);
		Al.add(45);
		Al.add(98);
		
		synchronized(Al){
			Iterator it=Al.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
	}

}
