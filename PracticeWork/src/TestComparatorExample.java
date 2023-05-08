
import java.util.*;

public class TestComparatorExample {
	public static void main(String[] args) {
		Student st=new Student(10,"nitin",23);
		Student st1=new Student(15,"jitin",43);
		Student st2=new Student(9,"sanjay",36);
		Student st3=new Student(11,"raju",54);
		
		ArrayList Al=new ArrayList();
		Al.add(st);
		Al.add(st1);
		Al.add(st2);
		Al.add(st3);
		
		System.out.println("Sorting by Age:");
		Collections.sort(Al,new AgeComparator());
		Iterator it=Al.iterator();
		while(it.hasNext()) {
			Student s=(Student)it.next();
			System.out.println(s.id+" "+s.name+" "+s.age);
		}
		
		System.out.println("");
		
		System.out.println("Sorting by Name:");
		Collections.sort(Al,new NameComparator());
		Iterator it1=Al.iterator();
		while(it1.hasNext()) {
			Student s=(Student)it1.next();
			System.out.println(s.id+" "+s.name+" "+s.age);
		}
		
		System.out.println("");
		
		System.out.println("Sorting by Id:");
		Collections.sort(Al,new IdComparator());
		Iterator it2=Al.iterator();
		while(it2.hasNext()) {
			Student s=(Student)it2.next();
			System.out.println(s.id+" "+s.name+" "+s.age);
		}
	}

}
