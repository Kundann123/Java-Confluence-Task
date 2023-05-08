package Collecton;
import java.util.*;

public class ArrayLstExample {
	public static void main(String[] args) {
		ArrayList<Integer> Al=new ArrayList<>();
		Al.add(10);
		Al.add(50);
		Al.add(30);
		Al.add(40);
		Al.add(20);
		
		System.out.println("Normal arraylist: "+Al);
		
		System.out.println("Using iterator:");
		Iterator it=Al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Sorted arraylist:");
		Collections.sort(Al);
		for(int i:Al) {
			System.out.println(i);
		}
		
		System.out.println("Using listiterator:");
		ListIterator<Integer> Li=Al.listIterator();
		while(Li.hasNext()) {
			System.out.println(Li.next());
		}
		
		System.out.println("Reverse:");
		ListIterator<Integer> List=Al.listIterator(Al.size());
		while(List.hasPrevious()) {
			System.out.println(List.previous());
		}
		
		System.out.println(Al.clone());
		}

}
