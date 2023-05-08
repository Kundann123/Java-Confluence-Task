//Collection Q2

package HelloWorld;
import java.util.*;

public class ArrayToArraylist {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		for(int i:arr) {
			System.out.println(i);
		}
		
		ArrayList<Integer> Al=new ArrayList<>();
		for(int i:arr) {
			Al.add(i);
		}
		System.out.println(Al);
		
		ArrayList<Integer> Al1=new ArrayList<>();
		Al1.add(10);
		Al1.add(20);
		Al1.add(30);
		Al1.add(40);
		System.out.println(Al1);
		
		int[] arr1=new int[Al1.size()];
		for(int i=0;i<Al1.size();i++) {
			arr1[i]=Al1.get(i);
		}
		
		for(Object obj:arr1) {
			System.out.println(obj);
		}
		
	
	}

}
