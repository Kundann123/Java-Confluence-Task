package World;

class Bv{
	final int a=10;
	final void msg() {
		System.out.println("Final Method");
	}
}

public class FinalKeyword {
	public static void main(String[] args) {
		Bv b=new Bv();
		b.msg();
		System.out.println(b.a);
	}

}
