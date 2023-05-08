package Collecton;
import java.util.*;


public class VectorExample {
	public static void main(String[] args) {
		Vector<String> vec=new Vector<>();
		vec.add("ml");
		vec.add("nlp");
		vec.add("daa");
		vec.add("os");
		vec.addElement("mds");
		vec.addElement("web");
		vec.addElement("ds");
		System.out.println(vec);
		
		vec.setElementAt("dms", 2);
		System.out.println(vec);
	}

}
