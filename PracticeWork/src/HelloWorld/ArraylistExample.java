//Collection Q4

package HelloWorld;
import java.util.*;

public class ArraylistExample {
	public static void main(String[] args) {
		ArrayList<Integer> Al=new ArrayList<>();
		Al.add(10);
		Al.add(66);
		Al.add(4);
		Al.add(25);
		Al.add(89);
		
		System.out.println("Iterate ArrayList using Java ListIterator");
		ListIterator<Integer> ll=Al.listIterator();
		while(ll.hasNext()) {
			System.out.println(ll.next());
		}
		
		System.out.println("add element at specific index");
		Al.set(2,96);
		
		System.out.println("Sort elements of Java ArrayList");
		Collections.sort(Al);
		
		System.out.println("Sort ArrayList in descending order");
		ListIterator<Integer> li=Al.listIterator(Al.size());
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		System.out.println("Search an element of Java ArrayList");
		 boolean ans = Al.contains(96);
		 if (ans)
	            System.out.println("96 found");
	     else
	            System.out.println("96 not found");
		 
		 System.out.println("Remove element from specified index ArrayList");
		 Al.remove(2);
		 
		 System.out.println("Remove duplicates from arraylist without using collections");
		 for(int i=0;i<Al.size();i++) {
			 for(int j=i+1;j<Al.size();j++) {
				 if(Al.get(i).equals(Al.get(j))) {
					 Al.remove(j);
					 j--;
				 }
			 }
		 }
		 System.out.println(Al);
	}

}
