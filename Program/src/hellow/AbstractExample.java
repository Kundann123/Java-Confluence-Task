package hellow;

abstract class Empl{
	abstract void salary();
	
	public Empl() {
		System.out.println("Abstact Constructor");
	}
	
	void display() {
		System.out.println("non abstract method");
	}
}

class Tester extends Empl{
	void salary() {
		System.out.println("tester salary:2000");
	}
}

class design extends Empl{
	void salary() {
		System.out.println("design salary:3000");
	}
}

public class AbstractExample {
	public static void main(String[] args) {
		Empl e=new Tester();
		e.salary();
		//e.display();
		
	}

}
