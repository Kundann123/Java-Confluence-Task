//Collection Q6

package HelloWorld;
import java.util.*;

public class HashsetToArray {
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(53);
		hs.add(45);
		hs.add(2);
		hs.add(12);
		System.out.println(hs);
		
		int[] arr=new int[hs.size()];
		int i=0;
		for(Integer k:hs) {
			arr[i++]=k;
		}
		System.out.println("Array");
		for(int j:arr) {
			System.out.println(j);
		}
	}

}
