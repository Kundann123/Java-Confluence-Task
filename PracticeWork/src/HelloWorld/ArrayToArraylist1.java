///Collection Q2

package HelloWorld;
import java.util.*;

public class ArrayToArraylist1 {
	public static void main(String[] args) {
		String[] arr= {"nitin","ravi","kashi"};
		List Al=Arrays.asList(arr);
		System.out.println(Al);
		
		ArrayList<Integer> Al1=new ArrayList<>();
		Al1.add(10);
		Al1.add(20);
		Al1.add(30);
		System.out.println(Al1);
		
		Object[] arr1=Al1.toArray();
		for(Object o:arr1) {
			System.out.println(o);
		}
	}
}
