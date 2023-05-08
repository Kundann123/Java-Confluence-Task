import java.util.*;

class P {

	public void firstName(){
		System.out.println("Mayank");
	}

	public final void surName(){
		System.out.println("Trivedi");
	}
}

public class C extends P{

	public void firstName(){
		System.out.println("Sharma");
	}

	public static void main(String[] args)
	{
		C obj=new C();
		obj.firstName();
		obj.surName();
		System.out.println("GFG");
	}
}
