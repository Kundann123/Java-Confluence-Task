package hellow;
import java.util.*;

public class diff {
	public static void main(String[] args) {
		ArrayList<Integer> Al=new ArrayList<Integer>();
		Al.add(10);
		Al.add(80);
		Al.add(60);
		Al.add(20);
		Al.add(90);
		Al.add(30);
		System.out.println(Al);
		
		//sort
		Collections.sort(Al);
		System.out.println(Al);
		
		//Descending sort
		Collections.sort(Al,Collections.reverseOrder());
		System.out.println(Al);
		
		//ListIterator
		ListIterator<Integer> L1=Al.listIterator(Al.size());
		while(L1.hasPrevious()) {
			System.out.println(L1.previous());
		}
		while(L1.hasNext()) {
			System.out.println(L1.next());
		}
		//IterATOR
		Iterator<Integer> it=Al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//Add element at index 1
		Al.add(1,45);
		System.out.println(Al);
		
		//Replace element index 1
		Al.set(1, 100);
		System.out.println(Al);
		
		//remove
		Al.remove(1);
		System.out.println(Al);
	}

}
