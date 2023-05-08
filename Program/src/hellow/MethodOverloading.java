package hellow;

class pl{
	public int multiply(int a,int b) {
		return a*b;
	}
	static int multiply(int a,int b,int c) {
		return a*b*c;
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		pl p=new pl();
		System.out.println(p.multiply(10,20));
		//System.out.println(pl.multiply(10,20));
		System.out.println(pl.multiply(10,20,30));
	}

}
