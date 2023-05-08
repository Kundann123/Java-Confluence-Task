//Colletion Q19

import java.util.*;
public class ArrayExample19 {
	public static int removeDuplicate(int[] arr,int n) {
		int[] arr1=new int[10];
		int k=0;
		for(int i=0;i<n-1;i++) {
				if(arr[i]!=arr[i+1]) {
					arr1[k++]=arr[i];
				}
		}
		arr1[k++]=arr[n-1];  //for adding last element
		
		for(int i=0;i<k;i++) {
			arr[i]=arr1[i];
		}
		return k;
		
	}
	
	public static void main(String[] args) {
		int[] arr= {10,50,10,40,50,50};
		Arrays.sort(arr);
		int n=arr.length;
		n=removeDuplicate(arr,n);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}


}
