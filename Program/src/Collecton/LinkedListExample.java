package Collecton;
import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("amit");
		ll.add("sumit");
		ll.add("anil");
		ll.add("ramesh");
		ll.add("amit");
		ll.add("sumit");
		
		System.out.println(ll);
		
		ll.removeFirstOccurrence("amit");
		System.out.println(ll);
		
		ll.removeLastOccurrence("sumit");
		System.out.println(ll);
		
		Iterator itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ll.poll();
		System.out.println(ll);
	}

}
