//Collection Q7

package HelloWorld;
import java.util.*;

public class ReverseArraylist {
	public static void main(String[] args) {
		ArrayList<Integer> Al=new ArrayList<>();
		Al.add(12);
		Al.add(25);
		Al.add(65);
		Al.add(2);
		Al.add(23);
		System.out.println(Al);
		
		Collections.sort(Al);
		System.out.println(Al);
		
		ArrayList<Integer> revAl=new ArrayList<>();
		for(int i=Al.size()-1;i>=0;i--) {
		    revAl.add(Al.get(i));
		}
		System.out.println(revAl);
	}

}
