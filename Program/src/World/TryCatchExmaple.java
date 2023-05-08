package World;

public class TryCatchExmaple {
	public static void main(String[] args) {
		try {
			
			try {
				System.out.println("First inner try");
				int a=10/0;
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			
			try {
				System.out.println("Second inner try");
				int[] b=new int[5];
				b[5]=10;
			}catch(ArrayIndexOutOfBoundsException e1) {
				System.out.println(e1);
			}
			
			System.out.println("Remaining code");
			
		}
		catch(Exception e2) {
			System.out.println(e2);
			System.out.println("outer catch");
		}
		System.out.println("Remaining Outer code");
	}

}
