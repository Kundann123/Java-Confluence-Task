package HelloWorld;
import java.util.*;

public class ComparableExample {
	public static void main(String[] args){
		ArrayList<Employee> Al=new ArrayList<Employee>();
		Al.add(new Employee(21,"nitin",20000));
		Al.add(new Employee(11,"kishor",18000));
		Al.add(new Employee(20,"ravi",25000));
		Al.add(new Employee(25,"nana",9000));
		
		Collections.sort(Al);
		for(Employee e:Al) {
			System.out.println(e.id+" "+e.name+" "+e.salary);
		}

	}
}
