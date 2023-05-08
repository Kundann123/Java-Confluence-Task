//Collection Q2
package HelloWorld;
import java.util.*;

public class ArrayToArraylist2 {
		public static void main(String[] args) {
			String[] arr= {"nitin","ravi","kashi"};
			ArrayList<String> Al=new ArrayList<>();
			Collections.addAll(Al, arr);
			System.out.println(Al);
			
			
			ArrayList<Integer> Al1=new ArrayList<>();
			Al1.add(10);
			Al1.add(20);
			Al1.add(30);
			System.out.println(Al1);
			
			Integer[] arr1=new Integer[Al1.size()];
			arr1=Al1.toArray(arr1);
			for(Integer o:arr1) {
				System.out.println(o);
			}
		
	}

}
