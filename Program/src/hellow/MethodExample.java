package hellow;

public class MethodExample {
	public static void main(String[] args) {
		int n=5;
		evenOdd(n);
	}
	static void evenOdd(int a) {
		if(a%2==0) {
			System.out.println("EVEN");
		}
		else {
			System.out.println("ODD");
		}
	}

}
