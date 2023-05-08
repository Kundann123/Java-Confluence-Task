package hellow;

class Animal{
	Animal(){
		System.out.println("Animal's Constructor");
	}
	String name="King";
	void sound() {
		System.out.println("sss");
	}
}
class dog extends Animal{
	dog(){
		super();
		System.out.println("Dog's Constructor");
	}
	void sound() {
		System.out.println("kkk");
		super.sound();
		System.out.println(super.name);
		
	}
}

public class SuperKeyword {
	public static void main(String[] args) {
		dog d=new dog();
		d.sound();	
		}
	}


