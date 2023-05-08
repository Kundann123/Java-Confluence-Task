package hellow;

public class whileLoop {
	public static void main(String[] args) {
		int n=5;
//		while(n<10) {
//			System.out.println(n);
//			n++;
//		}
		
		do {
			if(n%2==0) {
				System.out.println(n);
			}
			n++;
		}while(n<10);
	}


}
