package World;

public class ThrowExample {
	public static void evenOdd(int n) {
		if(n%2!=0) {
			throw new ArithmeticException("Not even");
		}
		else {
			System.out.println("Even");
		}
	}
	
	public static void main(String[] args) {
		int num=13;
		evenOdd(num);
	}

}
