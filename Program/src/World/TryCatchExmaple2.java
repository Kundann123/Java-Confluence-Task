package World;

public class TryCatchExmaple2 {
	public static void main(String[] args) {
		try {
			
			try {
				
				try {
					int a=20/0;
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println(e);
					System.out.println("first inner catch");
				}
			   }
			    
				catch(ArithmeticException e1) {
					System.out.println(e1);
					System.out.println("Second inner catch");
				}
		    }
				catch(NullPointerException e2) {
					System.out.println(e2);
					System.out.println("Outer catch");
				}
		
	}

}
