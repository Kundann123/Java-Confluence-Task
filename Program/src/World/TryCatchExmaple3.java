package World;

public class TryCatchExmaple3 {
	public static void main(String[] args) {
		int[] t=new int[5];
		try {
//			int[] t=new int[5];
			t[6]=65;
		}catch(NullPointerException e) {
			System.out.println(e);
			System.out.println("Catch block");
		}
		
//		catch(Exception e1) {
//			System.out.println(e1);
//		}
		
		finally {
			t[3]=10;
			System.out.println("Finally block");
			System.out.println(t[3]);
			
		}
	}

}
