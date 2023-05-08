package hellow;

public class child implements Parent,Parent1 {
	public void walk() {
		System.out.println("walking");
	}
	public void talk() {
		System.out.println("talking");
	}
	
	public static void main(String[] args) {
		child c=new child();
		c.walk();
		c.talk();
	}
	
}