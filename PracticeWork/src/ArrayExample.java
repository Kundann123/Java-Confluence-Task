//Collection Q18

import java.util.*;

public class ArrayExample {
	public static void main(String[] args) {
		String[] arr= {"ravi","kumar","viki","sumit","abhi"};
		Arrays.sort(arr);
		for(String s:arr) {
			System.out.println(s);
		}
		
		int t=arr.length;
		System.out.println(t);
	
		
		
		if(t%2==0) {
			String[] arr1=new String[t];
			for(int i=0;i<t/2;i++) {
				arr1[i]=arr[i].toUpperCase();
			}
			for(int j=t-1;j>=t/2;j--) {
				arr1[j]=arr[j].toLowerCase();
			}
			
			for(String str:arr1) {
				System.out.println(str);
			}
		}
		else {
			String[] arr1=new String[t];
			for(int i=0;i<=t/2;i++) {
				arr1[i]=arr[i].toUpperCase();
			}
			for(int j=t-1;j>t/2;j--) {
				arr1[j]=arr[j].toLowerCase();
			}
			
			for(String str:arr1) {
				System.out.println(str);
			}
			
		}
	}

}
