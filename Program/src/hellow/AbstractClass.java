package hellow;

abstract class Vehicle{
	abstract void run();
}

class bike extends Vehicle{
	void run() {
		System.out.println("Bike");
	}
}

class car extends Vehicle{
	void run() {
		System.out.println("Car");
	}
}


public class AbstractClass {
	public static void main(String[] args) {
		Vehicle c=new car();
		c.run();
	}

}
