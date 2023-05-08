//Collection Q5

package HelloWorld;
import java.util.*;

public class LinkedlistToArraylist {
	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(50);
		ll.add(40);
		ll.add(80);
		ll.add(10);
		System.out.println(ll);
		
		System.out.println("Linkedlist To Arraylist");
		ArrayList<Integer> Al=new ArrayList<>(ll);
		for(Integer i:Al) {
			System.out.println(i);
		}
	}

}
